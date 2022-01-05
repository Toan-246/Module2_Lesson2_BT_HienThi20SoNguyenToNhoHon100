package com.codegym;

public class Main {

    public static void main(String[] args) {
        int number = 0;

        while (number <100) {
            if (number < 2) {
                number++;
                continue;
            }
//            else if (number == 2) {
//                System.out.println(number);
//            }
            else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number);
                }

            }
            number++;
        }

    }

}