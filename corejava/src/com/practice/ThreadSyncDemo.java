package com.practice;

class Counter 
{
    private int count = 0;

    public synchronized void increment() 
    {
        count++;
    }

    public int getCount() 
    {
        return count;
    }
}

class CounterThread extends Thread
{
    private Counter counter;

    public CounterThread(Counter counter) 
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) 
        {
            synchronized (counter) 
            {
                counter.increment(); 
                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter.getCount());
            }
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) 
            {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}
public class ThreadSyncDemo
{
	public static void main(String[] args) 
	{
        Counter counter = new Counter(); 

        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
