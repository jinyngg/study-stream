package com.study.functional;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = (String str) -> {
            System.out.println(str);
        };
        stringConsumer.accept("hello world!");

        // Arrays.asList 를 사용하여 만들어진 리스트는 추가, 제거 할 수 없다.
        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> integerConsumer = (Integer x) -> {
            System.out.println("Consumer Integer : " + x);
        };

        process(integerInputs, integerConsumer);

        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
        Consumer<Double> doubleConsumer = (Double x) -> {
            System.out.println("Consumer Double : " + x);
        };

        process(doubleInputs, doubleConsumer);

    }

//    public static void process(List<Integer> inputs, Consumer<Integer> processor) {
//        for (Integer input : inputs) {
//            processor.accept(input);
//        }
//    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}
