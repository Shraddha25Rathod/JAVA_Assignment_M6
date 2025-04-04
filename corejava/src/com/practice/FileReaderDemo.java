package com.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo 
{
	public static void main(String[] args) 
	{
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";


        try (FileWriter writer = new FileWriter(inputFileName)) 
        {
            writer.write("Hello, this is a sample text.\n");
            writer.write("FileReader and FileWriter demonstration in Java.");
            System.out.println("Content written to the file: " + inputFileName);
        } catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }


        try (FileReader reader = new FileReader(inputFileName)) 
        {
            int character;
            System.out.println("\nReading content from the file: " + inputFileName);
            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character); 

            }
        } catch (IOException e)
        {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(inputFileName);
             FileWriter writer = new FileWriter(outputFileName))
        {
            int character;
            while ((character = reader.read()) != -1) 
            {
                writer.write(character);
            }
            System.out.println("Content copied to the file: " + outputFileName);
        } catch (IOException e) 
        {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}

