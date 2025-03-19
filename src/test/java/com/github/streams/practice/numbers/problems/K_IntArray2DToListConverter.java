package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = NumbersProblemSolution.convertInt2DArrayToList(input);
    List<Integer> yourSolution = new ArrayList<>();

    for(int i = 0; i < input.length; i++) {
      List<Integer> v = new ArrayList<>();
      Arrays.stream(input[i]).forEach(v::add);
      yourSolution.addAll(v);
    }
    Integer[] test = yourSolution.toArray(new Integer[0]);
    for(Integer i : test){
      System.out.println(i);
    }
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
