package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a smallest possible value.
 *
 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
 *
 * output is: 133444576998
 *
 * Explanation: 1,3,34,4,45,76,9,98
 * */
class F_AscendingNumberValue {

  @Test
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    int[] y = {1, 34, 3, 98, 9, 76, 45, 4};
    var mySolution = NumbersProblemSolution.getSmallestPossibleValue(input);
    var yourSolution = "";

    for (int i = 0; i < y.length - 1; i++) {

      for(int j = i + 1; j < y.length; j++) {
        int temp;
        String string1 = String.valueOf(y[i]) + String.valueOf(y[j]);
        String string2 = String.valueOf(y[j]) + String.valueOf(y[i]);

        if(string1.compareTo(string2) > 0) {
          temp = y[i];
          y[i] = y[j];
          y[j] = temp;
        }
      }
    }

    Arrays.stream(y).forEach(a -> System.out.print(a));
    Assertions.assertEquals(mySolution, yourSolution);
  }

}
