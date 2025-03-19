package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class K_FindDuplicateStrings {
  @Test
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
    List<String> yourSolution;
    yourSolution = input.stream().distinct().toList();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
