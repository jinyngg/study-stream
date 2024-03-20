package com.study.functional;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPractice {

    public static void main(String[] args) {
        // 프로세싱 과정에서 index 또한 Input을 받아야한다는 것을 가정
        BiConsumer<Integer, Double> doubleBiConsumer = (Integer index, Double input) -> {
            System.out.println("Processing : " + input + " at index : " + index);
        };

        List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3);

        process(inputs, doubleBiConsumer);
    }

    public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
        for (int i = 0; i < inputs.size(); i++) {
            processor.accept(i + 1, inputs.get(i));

        }
    }
}
