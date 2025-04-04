package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{
	public static void main(String[] args)
	{
        String fileName = "sample.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;

            System.out.println("Reading file content line by line:");
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line); 
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}