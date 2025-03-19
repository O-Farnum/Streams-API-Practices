package com.github.streams.practice.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.strings.StringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class I_SecondHighestWordTest {
  @Test
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = StringProblemsSolution.find2ndLargestWordInTheString(input);

    String yourSolution = "";
    List<String> orderedList = Arrays.stream(input.split(" ")).sorted(Comparator.comparing(String::length)).toList();
    yourSolution = orderedList.get(orderedList.size() - 2);
    assertEquals(mySolution, yourSolution);
  }
}
