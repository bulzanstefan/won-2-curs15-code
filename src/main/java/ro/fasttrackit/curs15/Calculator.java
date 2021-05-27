package ro.fasttrackit.curs15;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return b == 0 ? 0 : (double) a / b;
    }
}
