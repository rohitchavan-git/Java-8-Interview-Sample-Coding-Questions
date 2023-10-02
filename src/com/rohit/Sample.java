package com.rohit;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;
import static java.util.List.of;
import static java.util.stream.Collectors.*;

public class Sample {
    public static void main(String[] args) {

        /**
         * Separate odd and even numbers in a list of integers.
         *
         * Given a list of integers, write a Java 8 program to separate
         * the odd and even numbers into two separate lists.
         */

        separationOfEvenOddNumberInMap();
        separationOfEvenOddNumberInList();

        /**
         * Remove duplicate elements from a list using Java 8 streams
         *
         * Write a Java 8 program to remove duplicate elements from a list
         * using the stream API and lambda expressions.
         */

        removeDuplicateFromList();


        /**
         * Find the frequency of each character in a string using Java 8 streams
         *
         * Write a Java 8 program to find the frequency of each character in
         * a given string using the stream API and collectors.
         */
        characterFrequency();

        /**
         * Find the frequency of each element in an array or a list
         *
         * Write a Java 8 program to find the frequency of
         * each element in an array or a list using streams and collectors.
         */

        wordFrequency();

        /**
         * Sort a given list of decimals in reverse order
         *
         * Write a Java 8 program to sort a given list of decimal numbers in reverse order.
         */

        reverseSortedList();

        /**
         * Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
         *
         * Given a list of strings, write a Java 8 program to join the strings
         * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
         */

        joinListOfStrings();

        /**
         * Print the numbers from a given list of integers that are multiples of 5
         *
         * Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
         */

        multipleOf5();

        /**
         * Find the maximum and minimum of a list of integers
         * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
         */

        minMaxFromList();

        /**
         * Merge two unsorted arrays into a single sorted array using Java 8 streams
         * Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.
         */
        mergeUnsortedArrayIntoSorted();

        /**
         * Merge two unsorted arrays into a single sorted array without duplicates
         * Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.
         */
        mergeUnsortedArrayIntoSortedWithoutDuplicate();

        /**
         * Get the three maximum and three minimum numbers from a given list of integers
         *
         * Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
         */

        min3max3();

        /**
         * Check if two strings are anagrams or not using Java 8 streams
         * Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
         */

        isAnagram();
        isAnagram2();

        /**
         * Find the sum of all digits of a number in Java 8
         *
         * Write a Java 8 program to find the sum of all digits of a given number.
         *
         */
        sumOf();
        /**
         * Find the second-largest number in an integer array
         *
         * Write a Java 8 program to find the second-largest number in an integer array.
         */
        secondLargestNumberFromList();


        /**
         * Sort a list of strings according to the increasing order of their length
         *
         * Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
         */
        sortByLengthOfList();
        /**
         * Find the sum and average of all elements in an integer array
         *
         * Write a Java 8 program to find the sum and average of all elements in an integer array.
         */

        calculateAndSumAndAverage();
        /**
         * Find the common elements between two arrays
         *
         * Write a Java 8 program to find the common elements between two arrays using streams.
         */
        commonElements();
        /**
         * Reverse each word of a string using Java 8 streams
         *
         * Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions
         */
        reverseEachWord();

        /**
         * Find the sum of the first 10 natural numbers
         *
         * Write a Java 8 program to find the sum of the first 10 natural numbers using streams.
         */

        int sumOf10NaturalNumber = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println(sumOf10NaturalNumber);

        /**
         * Reverse an integer array
         *
         * Write a Java 8 program to reverse an integer array.
         */
        reversedArray();

        /**
         * Find the most repeated element in an array
         *
         * Write a Java 8 program to find the most repeated element in an array.
         */

        mostRepeatedElement();

        /**
         * Check if a string is a palindrome using Java 8 streams
         *
         * Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.
         */

        checkIsTheStringPalindrome();

        /**
         * Find strings in a list that start with a number
         *
         * Given a list of strings, write a Java 8 program to find the strings that start with a number.
         */

        stringsStartsWithNumber();

        /**
         * Extract duplicate elements from an array
         *
         * Write a Java 8 program to extract duplicate elements from an array.
         */

        extractDuplicateElements();

        /**
         * Print duplicate characters in a string
         * Write a Java 8 program to print the duplicate characters in a string.
         */

        duplicateCharactersInString();

        /**
         * Find the first repeated character in a string
         * Write a Java 8 program to find the first repeated character in a string.
         */
        firstRepeatedCharacter();

        /**
         * Find the first non-repeated character in a string
         *
         * Write a Java 8 program to find the first non-repeated character in a string.
         */
        firstNonRepeatingCharacter();

        /**
         * Generate the Fibonacci series
         *
         * Write a Java 8 program to generate the Fibonacci series.
         */
        generateFibonacciSeries();

        /**
         * Print the first 10 odd numbers
         *
         * Write a Java 8 program to print the first 10 odd numbers.
         */
        firstTenOddNumbers();

        /**
         * Get the last element of an array
         *
         * Write a Java 8 program to get the last element of an array.
         */

        lastElementInTheArray();

        /**
         * Calculate the age of a person in years
         *
         * Write a Java 8 program to calculate the age of a person in years given their birthday.
         */
        calculatePersonAgeInYear();
    }

    private static void calculatePersonAgeInYear() {
        LocalDate birthDate = LocalDate.of(1998, 8, 17);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age of the person is: " + age);
    }

    private static void lastElementInTheArray() {
        int[] intArray = {0,1,2,3,4,5};
        Integer lastElementInTheArray = Arrays.stream(intArray)
                .boxed()
                .reduce((first, second) -> second).orElse(-1);
        System.out.println("\nlast elements in the array " + lastElementInTheArray);
    }

    private static void firstTenOddNumbers() {
        Stream.iterate(1,i->i+2)
                .limit(10)
                .forEach(System.out::print);
    }

    private static void generateFibonacciSeries() {

        Stream.iterate(new int[]{0,1},t->new int[]{ t[1], t[0]+ t[1] })
                .limit(10)
                .map(t->t[0])
                .forEach(System.out::print);

        Function<int[], List<Integer>> intArraytoListOFInt = array -> Arrays.stream(array).boxed()
                .collect(toList());
        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(intArraytoListOFInt)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        System.out.println(collect);
    }

    private static void firstNonRepeatingCharacter() {
        String tempStr = "rohitrohi";
        System.out.println (Arrays.stream (tempStr.split (""))
                .filter (str -> tempStr.indexOf (str) == tempStr.lastIndexOf (str))
                .findFirst ()
                .orElse (""));

    }

    private static void checkIsTheStringPalindrome() {
        String str = "momd";
        String temp = str.replaceAll("\\s+", "").toLowerCase();
        System.out.println("is palindrome string " +IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)));
    }

    private static void firstRepeatedCharacter() {
        String word = "rohttoh";
        System.out.println (Arrays.stream (word.split (""))
                .filter (str -> word.indexOf (str) != word.lastIndexOf (str))
                .findFirst ().orElse (""));
    }

    private static void duplicateCharactersInString() {
        String word = "rohttoh";
        System.out.println ("original String " + word);


        System.out.println (Arrays.stream (word.split (""))
        .filter (str -> word.indexOf (str) != word.lastIndexOf (str))
        .map (str -> str.charAt (0))
        .collect (toList ()));
    }

    private static void extractDuplicateElements() {
        List<Integer> duplicateElements = of(1, 2,2,2,3, 3, 4, 5,1,1,56, 7, 8, 9, 10);

        System.out.println("maxed Elements " + duplicateElements);

        List<Integer> extractDuplicateElements = duplicateElements.stream()
                .filter(element -> duplicateElements.indexOf(element)
                        != duplicateElements.lastIndexOf(element))
                .distinct()
                .collect(toList());


        System.out.println("extract duplicates elements from " + extractDuplicateElements);
    }

    private static void stringsStartsWithNumber() {
        String [] words= {"rohit","foo","nemo","target1","12Target","2robot"};

        System.out.println("original Strings " + Arrays.toString(words));

        List<String> stringStartNumber = Arrays.stream(words)
                 .filter(word -> Character.isDigit(word.charAt(0)))
                 .toList();
        System.out.println("strings started with a number " + stringStartNumber);
    }

    private static void mostRepeatedElement() {
        int [] elements = {2,3,1,4,4,1,4,333,3,333,2,2,2,5,222};

        System.out.println("original Array" + Arrays.toString(elements));
        Function<Map<Integer, Long>, Integer> maxValuesKey = integerLongMap ->
                integerLongMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(Integer.MAX_VALUE);

        Integer maxDuplicateValue = Arrays.stream(elements)
                .boxed()
                .collect(collectingAndThen(groupingBy(Function.identity(),
                        counting()), maxValuesKey));

        System.out.println("max duplicate value in the array "+maxDuplicateValue);
    }

    private static void reversedArray() {
        int [] numberArray ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array" + Arrays.toString(numberArray));
        int[] reversedArray = IntStream.rangeClosed(1, numberArray.length)
                .map(number -> numberArray[numberArray.length - number])
                .toArray();
        System.out.println("reversedArray Array" + Arrays.toString(reversedArray));
    }

    private static void reverseEachWord() {
        String stmt = "java is OOP language";
        String reverseEachWord = Arrays.stream(stmt.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(joining(" "));
        System.out.println(reverseEachWord);
    }

    private static void commonElements() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> twoToTen = of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> commonElements = oneToTen.stream()
                .filter(twoToTen::contains)
                .toList();
        System.out.println(commonElements);
    }

    private static void calculateAndSumAndAverage() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics summaryStatistics = oneToTen.stream()
                .collect(summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());
    }

    private static void sortByLengthOfList() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        names.stream()
              .sorted(Comparator.comparingInt(String::length))
              .forEach(System.out::println);
    }

    private static void secondLargestNumberFromList() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer secondLarge = oneToTen.stream()
                .sorted(reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(Integer.MAX_VALUE);

        System.out.println(secondLarge);
    }

    private static void sumOf() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(oneToTen.stream()
                .mapToInt(Integer::intValue)
                .sum());
    }

    private static boolean isAnagram2() {

        String string1 = "listen";
        String string2 = "silent";

        String join1 = Arrays.stream(string1.split(""))
                .sorted()
                .collect(joining(""));
        String join2 = Arrays.stream(string2.split(""))
                .sorted()
                .collect(joining(""));
        return join1.equals(join2);

    }

    private static void isAnagram() {
        char[] splitIt = "listen".toCharArray();
        char[] splitIt2 = "silent".toCharArray();

        Arrays.sort(splitIt);
        Arrays.sort(splitIt2);
        if (Arrays.equals(splitIt,splitIt2)) {
            System.out.println("is Anagram");
        }else{
            System.out.println("is not anagram");
        }

    }

    private static void min3max3() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> min3 = randomNumbers.stream()
                .sorted(Integer::compare)
                .limit(3)
                .collect(toList());

        List<Integer> max3 = randomNumbers.stream()
                .sorted((x, y) -> Integer.compare(y, x))
                .limit(3)
                .collect(toList());
        System.out.println(min3);
        System.out.println(max3);
    }

    private static void mergeUnsortedArrayIntoSortedWithoutDuplicate() {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};

        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2))
                .distinct()
                .toArray()));
    }

    private static void mergeUnsortedArrayIntoSorted() {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};

        int[] sortedArrayByMergingTwoArray = IntStream.concat(Arrays.stream(randomNumbers),
                Arrays.stream(randomNumber2)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));
    }

    private static void minMaxFromList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        Integer maxNumber = randomNumbers.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        Integer minValue = randomNumbers.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
        System.out.println(maxNumber);
        System.out.println(minValue);
        IntSummaryStatistics summaryStatistics = randomNumbers.stream()
                .collect(summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());
    }

    private static void multipleOf5() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> multipleOf5 = randomNumbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(toList());
        System.out.println(multipleOf5);
    }

    private static void joinListOfStrings() {
        List<String> languageList = of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String joinWithPrefixSuffixAndDelimiter = languageList
                .stream()
                .collect(joining(",", "[", "]"));
        System.out.println(joinWithPrefixSuffixAndDelimiter);
    }

    private static void reverseSortedList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        //this is throwing unsupportedOprerationException because we are
        // tries to sort ImmutableList that is not allowed .
        //   randomNumbers.sort(Comparator.reverseOrder());
        System.out.println(randomNumbers);
        List<Integer> sortInReverse = randomNumbers.stream()
                .sorted((x, y) -> Integer.compare(y, x)) // reverse sort
                .collect(toList());
        System.out.println(sortInReverse);

        List<Integer> sortListReverse = randomNumbers.stream()
                .sorted(reverseOrder())
                .collect(toList());
        System.out.println(sortListReverse);

    }

    private static void wordFrequency() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        Map<String, Long> frequencyWords = names.stream()
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(frequencyWords);
    }

    private static void characterFrequency() {
        String name = "rohitroh";
        Map<String, Long> characterFrequency = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(characterFrequency);


        Map<Character, Long> collected = name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(collected);

        Map<String, Integer> countCharacter = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(),
                        collectingAndThen(counting(), Long::intValue)));
        System.out.println(countCharacter);
    }

    private static void removeDuplicateFromList() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> removeDuplicate = oneToTen.stream()
                .distinct()
                .collect(toList());

        System.out.println(removeDuplicate);
        Set<Integer> removeDuplicateWithoutOrder
                = oneToTen.stream()
                .collect(toSet());
        System.out.println(removeDuplicateWithoutOrder);

        List<Integer> uniqueElement = oneToTen
                .stream()
                .filter(number -> oneToTen.indexOf(number)
                        == oneToTen.lastIndexOf(number))
                .collect(toList());
        System.out.println(uniqueElement);
    }

    private static void separationOfEvenOddNumberInList() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collection<List<Integer>> evenOddList = oneToTen.stream()
                .collect(collectingAndThen(partitioningBy(i -> i % 2 == 0),
                        Map::values));

        System.out.println(evenOddList);
    }

    private static void separationOfEvenOddNumberInMap() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
                .collect(partitioningBy(i -> i % 2 == 0));

        System.out.println(evenAddOddSeparation);
    }
}
