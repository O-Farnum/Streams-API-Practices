package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
class A_SumOfNumbers {

  @Test
  void testSumOfUniqueDigitsTest() {
    List<Integer> input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    long mySolution = NumbersProblemSolution.sumOfUniqueNumbers(input);
    long yourSolution = input.stream().distinct().reduce(0, Integer::sum);

    Set<Integer> x = new HashSet<>();
    int sum = 0;

    for(Integer num : input) {
      if(x.contains(num)) continue;
      sum += num;
    }
    Assertions.assertEquals(mySolution, yourSolution);

  }
}
