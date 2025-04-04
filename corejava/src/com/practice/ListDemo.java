package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements:");
        for (String element : arrayList)
        {
            System.out.println(element);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        System.out.println("\nLinkedList Elements:");
        for (String element : linkedList) 
        {
            System.out.println(element);
        }

        System.out.println("\nAccessing elements directly:");
        System.out.println("ArrayList First Element: " + arrayList.get(0)); // Fast access
        System.out.println("LinkedList First Element: " + linkedList.get(0)); // Relatively slower access

        arrayList.add(1, "Blueberry"); 
        linkedList.add(1, "Lion"); 

        System.out.println("\nModified ArrayList: " + arrayList);
        System.out.println("Modified LinkedList: " + linkedList);

        arrayList.remove("Banana");
        linkedList.remove("Elephant");

        System.out.println("\nArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);
    }
}