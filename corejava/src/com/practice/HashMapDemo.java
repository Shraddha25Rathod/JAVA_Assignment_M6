package com.practice;

import java.util.HashMap;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        System.out.println("HashMap Contents: " + ageMap);

        String keyToSearch = "Alice";
        if (ageMap.containsKey(keyToSearch)) 
        {
            System.out.println(keyToSearch + "'s age is: " + ageMap.get(keyToSearch));
        } else {
            System.out.println(keyToSearch + " is not found in the HashMap.");
        }

        System.out.println("\nIterating through the HashMap:");
        for (String key : ageMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + ageMap.get(key));
        }

        ageMap.remove("Bob");
        System.out.println("\nHashMap after removal: " + ageMap);
    }
}
