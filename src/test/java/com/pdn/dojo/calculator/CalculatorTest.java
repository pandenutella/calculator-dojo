package com.pdn.dojo.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void when_calculate_should_return_the_sum_given_an_addition_expression() {
        double result = calculator.calculate("3 + 2 + 1");

        assertThat(result).isEqualTo(6);
    }

    @Test
    void when_calculate_should_return_the_difference_given_a_subtraction_expression() {
        double result = calculator.calculate("3 - 2 - 1");

        assertThat(result).isEqualTo(0);
    }

    @Test
    void when_calculate_should_return_the_product_given_a_multiplication_expression() {
        double result = calculator.calculate("3 * 2 * 1");

        assertThat(result).isEqualTo(6);
    }

    @Test
    void when_calculate_should_return_the_quotient_given_a_division_expression() {
        double result = calculator.calculate("6 / 2 / 2");

        assertThat(result).isEqualTo(1.5);
    }

    @Test
    void when_calculate_should_return_the_result_given_a_addition_and_subtraction_expression() {
        double result = calculator.calculate("3 + 2 - 1");

        assertThat(result).isEqualTo(4);
    }

    @Test
    void when_calculate_should_return_the_result_given_a_multiplication_and_division_expression() {
        double result = calculator.calculate("3 * 3 / 2");

        assertThat(result).isEqualTo(4.5);
    }

    @Test
    void when_calculate_should_return_the_result_given_an_addition_subtraction_multiplication_and_division_expression() {
        double result = calculator.calculate("5 * 1 + 3 / 6 - 2");

        assertThat(result).isEqualTo(3.5);
    }
}