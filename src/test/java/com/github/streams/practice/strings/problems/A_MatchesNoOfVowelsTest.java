package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Finds the words with the given number of vowels in a given string. <br>
 * <br>
 * Example:
 *
 * <pre>
 *  "The quick brown fox jumps right over the little lazy dog.";
 * </pre>
 *
 * <pre>
 *   Number of Vowels: 2
 *   Words with Maximum Vowels: [quick, over, little]
 * </pre>
 *
 * <br>
 * Example:
 *
 * <pre>
 *  "Hello World";
 * </pre>
 *
 * <pre>
 *   Maximum Number of Vowels: 2
 *   Words with Maximum Vowels: [Hello, World]
 * </pre>
 */
class A_MatchesNoOfVowelsTest {
  @Test
  void testAM_MaxNoOfVowelsTest() {
    var input = "The quick brown fox jumps right over the little lazy dog.";
    final var length = 2;

    var mySolution = StringProblemsSolution.getMatchesVowels(input, length);
    List<String> yourSolution = new ArrayList<>();
    List<String> vowels = List.of("aeiouAEIOU".split(""));

    for(String word : input.split(" ")) {
      String[] splitWord = word.split("");
      int counter = 0;
      for(int i = 0; i < splitWord.length; i++) {
        if(vowels.contains(splitWord[i])) {
          counter++;
          if(counter > 2) {break;}
        }
      }
      if(counter == 2){ yourSolution.add(word); }
    }
    for(String word : yourSolution) {
      System.out.println(word);
    }
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
