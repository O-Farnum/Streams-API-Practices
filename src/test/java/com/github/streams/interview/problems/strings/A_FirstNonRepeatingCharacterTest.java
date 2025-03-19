package com.github.streams.interview.problems.strings;

import com.github.streams.interview.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Given a String find the first non-repeating character:
 *
 * String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class A_FirstNonRepeatingCharacterTest {

  @Test
  void testFirstNonRepeatingCharacter() {
    final var input =
        "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
    final var yourSolution = Arrays.stream(input.split(""))
            .filter(c -> input.length() - input.replace(c, "").length() == 1)
            .toList().get(0);
    final var mySolution = InterviewProblemSolutions.firstNonRepeatingCharacter(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
