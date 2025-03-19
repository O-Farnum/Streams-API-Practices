package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
class B_SumOfUniqueNumbers {

  @Test
  void testSumOfDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = NumbersProblemSolution.sumOfNumbers(input);
    Long yourSolution = Long.valueOf(input.stream().reduce(Integer::sum).stream().toList().get(0));

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
