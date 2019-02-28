package java8.function.utils;

import java.util.function.Consumer;

public class ConsumerFunction {

    public static void printNames(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Consumer<String> consumer = ConsumerFunction::printNames;
        consumer.accept("Vagish");
        consumer.accept("Gagan");
        consumer.accept("Prateek");


    }
}
