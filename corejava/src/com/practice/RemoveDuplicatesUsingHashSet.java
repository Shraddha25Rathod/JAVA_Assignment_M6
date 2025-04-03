package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesUsingHashSet 
{
	public static void main(String[] args) 
	{
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Cherry");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Cherry");
        listWithDuplicates.add("Date");

        System.out.println("Original List with Duplicates: " + listWithDuplicates);
        
        HashSet<String> set = new HashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("List After Removing Duplicates: " + listWithoutDuplicates);
    }
}
