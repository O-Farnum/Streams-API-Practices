package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import com.github.streams.practice.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
class G_DescendingNumberValue {

  @Test
  public void test() {
    var input = DummyData.fakeList();
    var mySolution = NumbersProblemSolution.getHighestPossibleValue(input);
    var yourSolution = "";
    int[] y = {1, 34, 3, 98, 9, 76, 45, 4};

    for (int i = 0; i < y.length - 1; i++) {

      for(int j = i + 1; j < y.length; j++) {
        int temp;
        String string1 = String.valueOf(y[i]) + String.valueOf(y[j]);
        String string2 = String.valueOf(y[j]) + String.valueOf(y[i]);

        if(string1.compareTo(string2) < 1) {
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
