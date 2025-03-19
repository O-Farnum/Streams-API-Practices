package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Unit test for reversing a string that contains special characters.
 *
 * <p>This test class is designed to verify the correctness of a method that reverses a string while
 * preserving the original positions of special characters.
 *
 * @author Zahid Khan.
 */
class H_ReverseStringWithSpecialCharactersTest {
  /**
   * Test case for reversing a string with special characters.
   *
   * @todo Implement this test method
   */
  @Test
  void testReverseStringWithSpecialCharactersTest() {
    var input = "Hello world! This is a test. 😅";
    var mySolution = StringProblemsSolution.reverseStringWithSpecialCharacters(input);

    var yourSolution = "";

    String[] splitInput = input.split("");
    String[] result = new String[splitInput.length];
    for(int i = 0; i < splitInput.length; i++) {
      result[splitInput.length - 1 - i] = splitInput[i];
    }
    yourSolution = String.join("",result);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
