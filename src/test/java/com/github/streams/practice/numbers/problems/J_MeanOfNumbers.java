package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J_MeanOfNumbers {
  @Test
  void meanOfNumbers() {
    final var input =
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    final var mySolution = NumbersProblemSolution.meanOfNumbers(input);
    final var yourSolution = input.stream().mapToDouble(Double::valueOf).reduce(Double::sum).orElse(0.0);

    System.out.println(yourSolution / (double) input.size());
    System.out.println(mySolution);
    Assertions.assertEquals(mySolution, yourSolution / (double) input.size());
  }
}
