package com.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample
{
	public static void main(String[] args)
	{
        String inputFile = "input.txt";  
        String outputFile = "output.txt"; 

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) 
        {
            int character;

            while ((character = reader.read()) != -1) 
            {
                writer.write(character);
            }

            System.out.println("File content has been successfully copied from " + inputFile + " to " + outputFile);
        } catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
