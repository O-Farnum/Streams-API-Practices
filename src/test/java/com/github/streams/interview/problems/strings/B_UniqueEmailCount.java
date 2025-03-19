package com.github.streams.interview.problems.strings;

import com.github.javafaker.Faker;
import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.Employee;
import com.github.streams.interview.problems.employee.ignore.domain_related.Identity;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
class B_UniqueEmailCount {
  @Test
  void findUniqueDomainsWithCount() {
    final var instance = Faker.instance();
    final var employees =
        List.of(
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""));

    final var mySolution = InterviewProblemSolutions.findUniqueDomainsCount(employees);
    var yourSolution = employees.stream().map(e -> e.email().split("@")[1]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
