package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.data.Offset.offset;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum method works")
    void simpleSum() {
        assertThat(calculator.sum(1, 1)).isEqualTo(2);
        assertThat(calculator.sum(3, 2)).isEqualTo(5);
        assertThat(calculator.sum(-3, 2)).isEqualTo(-1);
    }

    @Test
    @DisplayName("minus method works")
    void simpleSubstraction() {
        assertThat(calculator.diff(1, 1)).isEqualTo(0);
        assertThat(calculator.diff(2, 1)).isEqualTo(1);
        assertThat(calculator.diff(-2, 1)).isEqualTo(-3);
    }

    @Test
    @DisplayName("multiply works")
    void multiply() {
        assertThat(calculator.multiply(2, 10)).isEqualTo(20);
        assertThat(calculator.multiply(2, 0)).isEqualTo(0);
        assertThat(calculator.multiply(0, 2)).isEqualTo(0);
    }

    @Test
    @DisplayName("divison works")
    void division() {
        assertThat(calculator.div(10, 2)).isEqualTo(5);
        assertThat(calculator.div(10, 0)).isEqualTo(0);
        assertThat(calculator.div(-10, 3)).isEqualTo(-3.33, offset(.01));
    }
}
