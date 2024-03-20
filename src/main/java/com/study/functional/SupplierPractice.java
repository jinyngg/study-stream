package com.study.functional;
import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            return "Hello world";
        };
        System.out.println(stringSupplier.get());

        Supplier<Double> randomSupplier = () -> Math.random();
        printRandomDoubles(randomSupplier, 5);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
