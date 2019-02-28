package java8.function.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunction {

    public static void getNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Vagish", "Gagan", "Prateek");

        nameList.forEach((e) -> getNames(() -> e));
    }
}
