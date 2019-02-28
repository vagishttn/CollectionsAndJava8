package java8;

@FunctionalInterface
interface AdditionInterface {
    int addNumber(int a, int b);
}

public class Question2 {

    public static void main(String[] args) {

        AdditionInterface additionInterface = (a, b) -> a + b;
        System.out.println(additionInterface.addNumber(2, 3));

    }

}
