package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class B_LargestWordTest {
  /**
   * Find the largest word in a given string. <br>
   * <br>
   * Example string:
   *
   * <pre>
   * Input: "I am interested123455 to grow in my organization"
   * Output: "interested123455"
   * </pre>
   *
   * @author ZahidKhan
   * @see StringProblemsSolution#findLargestWordInTheString(String)
   */
  @Test
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String mySolution = StringProblemsSolution.findLargestWordInTheString(input);

    int max = Arrays.stream(input.split(" ")).map(String::length).sorted().reduce((a, b) -> b).get();
    String yourSolution = Arrays.stream(input.split(" ")).filter(word -> word.length() == max).toList().get(0);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
