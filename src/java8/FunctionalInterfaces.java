package java8;

@FunctionalInterface
interface NumberEquality {
    boolean checkNumber(int a, int b);
}

@FunctionalInterface
interface NumberIncrement {
    int incrementNumber(int a);
}

@FunctionalInterface
interface StringOperation {
    String concatString(String str, String str1);
}

@FunctionalInterface
interface StringConversion {
    String convertString(String str);
}


public class FunctionalInterfaces {

    public static void main(String[] args) {

        NumberEquality numberEquality = (a, b) -> a > b;
        System.out.println(numberEquality.checkNumber(2, 3));

        NumberIncrement numberIncrement = a -> ++a;
        System.out.println(numberIncrement.incrementNumber(3));

        StringOperation stringOperation = (str1, str2) -> str1 + str2;
        System.out.println(stringOperation.concatString("vagish ", "dixit"));

        StringConversion stringConversion = a -> a.toUpperCase();
        System.out.println(stringConversion.convertString("vagish"));


    }
}
