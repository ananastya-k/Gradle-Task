package ru.clevertec;

public class App {
    public static void main(String[] args) {

        boolean isAllPositive = Utils.isAllPositiveNumbers(args);
        System.out.println(isAllPositive
                ? "All numbers are positive."
                : "Some numbers are not positive.");
    }
}