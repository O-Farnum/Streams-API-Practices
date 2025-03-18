package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
class D_ValidNumbersOnly {
  @Test
  void testCheckAllIntegersWithoutAlphabets() {
    final var input = List.of("1", "12", "12a", "a12");
    List<String> yourSolution = List.of();
    var mySolution = NumbersProblemSolution.getNumberOnly(input);

    for(String seq : input) {
      try{
        Integer.valueOf(seq);
        yourSolution.add(seq);
      } catch (NumberFormatException e) {
          continue;
      }
    }

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
