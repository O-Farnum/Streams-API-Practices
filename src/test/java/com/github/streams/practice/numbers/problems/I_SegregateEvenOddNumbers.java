package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Divides a list of integers into two separate lists, one containing all even numbers and the other
 * containing all odd numbers. Input: {1, 2, 3, 4, 5, 6, 7, 8, 9} Output: {2, 4, 6, 8, 1, 3, 5, 7, 9
 * }
 */
class I_SegregateEvenOddNumbers {
  @Test
  void testSegregationOfEvenOddNumbersTest() {
    final var input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    final var mySolution = NumbersProblemSolution.segregateEvenOddNumbers(input.stream());

    List<Integer> evenNumbers = new ArrayList<>(input.stream().filter(a -> a % 2 == 0).toList());
    List<Integer> oddNumbers = input.stream().filter( a -> a % 2 != 0).toList();
    evenNumbers.addAll(oddNumbers);
    for(int i : evenNumbers){
      System.out.print(i + ", ");
    }
    Assertions.assertEquals(mySolution, evenNumbers);
  }
}
