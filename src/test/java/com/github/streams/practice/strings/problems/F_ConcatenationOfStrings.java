package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_ConcatenationOfStrings {
  /**
   * Given a list of strings, write a method to concatenate all the strings in the list, separated
   * by a comma, using Java 8 Streams.
   */
  @Test
  void testConcatenationOfStrings() {
    List<String> input = List.of("Hellow", "World", "Hello", "World");
    final var mySolution = StringProblemsSolution.concatenateStrings(input);
    String yourSolution = "";

    for(String word : input) {
      yourSolution += "," + word;
    }
    yourSolution = yourSolution.substring(1);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
