package com.github.streams.practice.strings.problems;

import com.github.streams.practice.strings.StringProblemsSolution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class L_ConvertListOfCharactersToString {
  @Test
  void convertListOfCharactersToString() {
    var listOfCharacters =
        List.of(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    var mySolution = StringProblemsSolution.convertListOfCharactersToString(listOfCharacters);
    String yourSolution = "";
    for(char c : listOfCharacters) {
      yourSolution += c;
    }
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
