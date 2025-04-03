package com.practice;

class SharedResource 
{
    private boolean available = false;

    public synchronized void produce() 
    {
        while (available) 
        {
            try {
                wait(); 
            } catch (InterruptedException e) 
            {
                System.out.println("Producer interrupted.");
            }
        }
        System.out.println("Producer: Resource produced.");
        available = true;
        notify(); 
    }

    public synchronized void consume()
    {
        while (!available) {
            try {
                wait(); 
            } catch (InterruptedException e)
{
                System.out.println("Consumer interrupted.");
            }
        }
        System.out.println("Consumer: Resource consumed.");
        available = false;
        notify(); 
    }
}

class Producer extends Thread 
{
    private SharedResource resource;

    public Producer(SharedResource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            resource.produce();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) 
            {
                System.out.println("Producer thread interrupted.");
            }
        }
    }
}

class Consumer extends Thread
{
    private SharedResource resource;

    public Consumer(SharedResource resource) 
    {
        this.resource = resource;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < 5; i++) 
        {
            resource.consume();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) 
            {
                System.out.println("Consumer thread interrupted.");
            }
        }
    }
}
public class InterThreadCommunicationDemo
{
	 public static void main(String[] args) 
	 {
	        SharedResource resource = new SharedResource();

	        Producer producer = new Producer(resource);
	        Consumer consumer = new Consumer(resource);

	        producer.start();
	        consumer.start();

	        try {
	            producer.join();
	            consumer.join();
	        } catch (InterruptedException e)
	        {
	            System.out.println("Main thread interrupted.");
	        }

	        System.out.println("Main thread finished execution.");
	    }
}
