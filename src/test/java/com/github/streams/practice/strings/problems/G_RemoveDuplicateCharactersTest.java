package com.github.streams.practice.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.strings.StringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

class G_RemoveDuplicateCharactersTest {
  @Test
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    String yourSolution = "";
    final String mySolution = StringProblemsSolution.getUniqueCharacters(input);

    yourSolution = Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
    assertEquals(mySolution, yourSolution);
  }
}
