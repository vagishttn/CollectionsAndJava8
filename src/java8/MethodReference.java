package java8;

@FunctionalInterface
interface NumberOperation {
    int mathematicalOperations(int a, int b);
}

public class MethodReference {

    public int addNumber(int a, int b) {
        return a + b;
    }

    public int subNumber(int a, int b) {
        return a - b;
    }

    public static int mulNumber(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        NumberOperation addOperation = new MethodReference()::addNumber;
        NumberOperation subOperation = new MethodReference()::subNumber;
        NumberOperation mulOperation = MethodReference::mulNumber;

        System.out.println(addOperation.mathematicalOperations(3, 2));
        System.out.println(subOperation.mathematicalOperations(3, 2));
        System.out.println(mulOperation.mathematicalOperations(2, 3));

    }
}
