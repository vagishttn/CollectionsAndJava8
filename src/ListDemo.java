/* Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.*/

import question4.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        float sum = 0.0f;
        List<Float> floats = new ArrayList<>();
        floats.add(2.3f);
        floats.add(7.3f);
        floats.add(12.5f);
        floats.add(8.9f);
        floats.add(100.1f);

        Iterator<Float> floatIterator = floats.iterator();
        while (floatIterator.hasNext()) {
            sum += floatIterator.next();
        }

        System.out.println("Sum of List is : " + sum);
    }

}
