package java8;


interface MyInterface {

    default void display() {
        System.out.println("Display Function in interface");
    }

    default void print() {
        System.out.println("Print Method in interface");
    }

    static void show() {
        System.out.println("Show method in interface");
    }

}

public class DefaultAndStatic implements MyInterface {

    @Override
    public void print() {
        System.out.println("Print method in class");
    }

    public void show() {
        System.out.println("Show method in class");
    }

    public static void main(String[] args) {
        DefaultAndStatic defaultAndStatic = new DefaultAndStatic();
        defaultAndStatic.print();
        defaultAndStatic.show();
        MyInterface.show();
        defaultAndStatic.display();
    }
}
