package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask #1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.println("\nTask #2");
        printEvenNumbersWithoutRepetition(nums);
        System.out.println("\nTask #3");
        List<String> words = new ArrayList<>(List.of("apple", "cherry", "apricot", "orange", "apple", "grape", "cherry"));
        printUniqueWords(words);
        System.out.println("\nTask #4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        printDuplicateQuantities(strings);
    }
    public static void printOddNumbers(List<Integer> nums){
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num: nums){
            if(num%2 != 0){
                evenNums.add(num);
            }
        }
        System.out.println(evenNums);
    }
    public static void printEvenNumbersWithoutRepetition(List<Integer> nums){
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num: nums){
            if(num%2 == 0 && !evenNums.contains(num)){
                evenNums.add(num);
            }
        }
        Collections.sort(evenNums);
        System.out.println(evenNums);
    }
    public static void printUniqueWords(List<String> words){
        List<String> uniqueWords = new ArrayList<>();
        for (String word: words) {
            if(!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);
    }
    public static void printDuplicateQuantities (List<String> strings){
        List<String> uniqueStrings = new ArrayList<>();
        for (String string: strings){
            if (!uniqueStrings.contains(string)){
                uniqueStrings.add(string);
                System.out.println(string + " - " + Collections.frequency(strings, string) + " раз");
            }
        }
    }


}