package com.vishnu.udemy.work;

//import the necessary packages if needed

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords {

    private static List<String> words;

    public static void main(String[] args) {
        // Create an ArrayList to count number of words
        // Create a set to count number of unique words

        Scanner scanner = new Scanner(System.in);

        // Inputting student article
        System.out.println("Enter Student's Article");
        String article = scanner.nextLine();

        // Splitting string to arraylist
        String[] strsplit = article.split("[,;:.?! ]");
        List<String> words = Arrays.stream(strsplit).filter(string -> !string.isEmpty()).toList();
        List<String> uniqueWords = words.stream().map(String::toLowerCase).distinct().sorted().toList();

        System.out.println("Number of words " + words.size());
        System.out.println("Number of unique words " + uniqueWords.size());
        System.out.println("The words are");

        IntStream.range(0, uniqueWords.size())
                .forEach(i -> System.out.println(String.format("%d. %s", (i + 1), uniqueWords.get(i))));

        scanner.close();

    }



}
