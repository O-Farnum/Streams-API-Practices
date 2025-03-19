package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class H_ReverseANumber {

  @Test
  void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.reverseANumber(input);
    int yourSolution = 0;

    List<String> x = List.of(String.valueOf(input).split(""));

    for(int i = x.size() - 1; i > -1; i--) {
      yourSolution = yourSolution * 10 + Integer.valueOf(x.get(i));
    }
    System.out.println(yourSolution);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
