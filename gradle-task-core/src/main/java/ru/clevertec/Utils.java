package ru.clevertec;

public class Utils {
    public static boolean isAllPositiveNumbers(String... numbers) {

        if( numbers.length == 0) return  false;

        boolean isAllPositive = true;

        for (String number: numbers) {

            if(StringUtils.isPositiveNumber(number)){
                System.out.println( number + " - is positive.");
            } else {
                System.out.println( number + " - non-positive.");
                isAllPositive = false;
            }
        }

        return isAllPositive;
    }}