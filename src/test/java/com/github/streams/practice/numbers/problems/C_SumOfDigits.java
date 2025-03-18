package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Tests the sumOfDigits method in the GeneralNumbersProblemSolution class.
 *
 * <p>This test case generates a random integer between 1 and the maximum possible integer value,
 * passes it to the sumOfDigits method, and verifies that the result is correct.
 *
 * <p>Note: This test case is currently disabled and should be updated to reflect the correct
 * expected behavior.
 *
 * @see NumbersProblemSolution#sumOfDigits(int)
 */
class C_SumOfDigits {

  @Test
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.sumOfDigits(input);
    var yourSolution = 0;

    for(int i = input; i > 0; i /= 10){
      yourSolution += i % 10;
    }
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
