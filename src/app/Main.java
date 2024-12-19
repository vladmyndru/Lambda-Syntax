package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;

        int sum = addition.operate(14, 22);
        System.out.println("Sum: " + sum);

        StringManipulator toUpperCase = s -> s.toUpperCase();
        String result = toUpperCase.manipulate("lambda syntax");
        System.out.println("Raw in upper register " + result);

        Function<String , Integer> uppercaseCounter =
                StringListProcessor ::countUppercase;

        int uppercaseCount = uppercaseCounter.apply("LambdA SyntaX");
        System.out.println("Number of large liters in a row: " + uppercaseCount);

        Supplier< Integer> randomNumberSupplier = () -> RandomNumberGenerator
                .generateRandomNumber(1, 100);

        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random number from 1 to 100: " + randomNumber);
    }
}
