package java8;

interface MyInterface1 {
    default void display() {
        System.out.println("Interface 1 Method");
    }
}

interface MyInterface2 {
    default void display() {
        System.out.println("Interface 2 Method");
    }
}

public class OverridingDefault implements MyInterface1, MyInterface2 {


    @Override
    public void display() {
        System.out.println("Class Method");
    }

    void showInterfaceMathod() {
        System.out.println("Interface 1>>>>>>>>>>");
        MyInterface1.super.display();
        System.out.println("-------------");
        System.out.println("Interface 2>>>>>>>>>>");
        MyInterface2.super.display();

    }

    public static void main(String[] args) {

        OverridingDefault overridingDefault = new OverridingDefault();
        overridingDefault.display();
        overridingDefault.showInterfaceMathod();


    }
}
