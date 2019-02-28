package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //even number

        System.out.println(
                integerList
                        .stream()
                        .filter(e -> e % 2 == 0)
                        .collect(Collectors.toList()));

        //sum number greater than 5
        System.out.println(
                integerList
                        .stream()
                        .filter(e -> e > 5)
                        .collect(Collectors.summingInt(e -> e)));

        System.out.println(
                (Integer) integerList
                        .stream()
                        .filter(e -> e > 5)
                        .mapToInt(e -> e)
                        .sum());

        //Average of Numbers After Doubling
        System.out.println(
                integerList
                        .stream()
                        .map(e -> e * 2)
                        .mapToInt(e -> e)
                        .average());

        //First Ever Number Greater Than 3

        System.out.println(
                integerList
                        .stream()
                        .filter(e -> e > 3 && e % 2 == 0)
                        .findFirst());
    }

}
