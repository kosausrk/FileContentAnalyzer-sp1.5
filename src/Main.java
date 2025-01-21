import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


//sp1.5
//Skills Covered: File I/O, methods, conditionals, loops, exceptions. Description: Create a program that reads a text file and calculates the number of lines, words, and characters. Extensions: Handle exceptions for file not found or empty files.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path: "); //im so fkn dumb I forgot the scanner doesn't print anything by default... took me til the next day to work on this
        String filePath = scanner.nextLine();
        wordCountFileWords(filePath); //"src/count.txt"
        scanner.close();
    }

    public static void wordCountFileWords(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int wordCount = 0;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Word wordCount: " + wordCount + "\n Line Count: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}