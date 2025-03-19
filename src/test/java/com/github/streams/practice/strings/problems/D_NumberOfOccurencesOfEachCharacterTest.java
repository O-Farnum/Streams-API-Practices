package com.github.streams.practice.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.strings.StringProblemsSolution;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = StringProblemsSolution.findOccurenceOfCharacter(input);
    Map<Character, Long> yourSolution = null;
    yourSolution = Arrays.stream(input.split("")).filter(c -> !c.equals(" ")).collect(Collectors.groupingBy(c -> c.charAt(0), Collectors.counting()));

    assertEquals(mySolution, yourSolution);
  }
}
