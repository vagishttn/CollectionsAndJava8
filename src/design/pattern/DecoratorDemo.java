package design.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Pizza {
    void makePizza();
}

class PaneerPizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("Paneer Pizza");
    }
}

class ChickenPizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("Chicken Pizza");
    }
}


abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ExtraCheeseDecorator extends PizzaDecorator {
    private String cheeseType;

    public ExtraCheeseDecorator(Pizza pizza, String cheeseType) {
        super(pizza);
        this.cheeseType = cheeseType;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println(" with extra cheese of type " + cheeseType);
    }
}

class VeggiesDecorator extends PizzaDecorator {
    List<String> vegetableList;

    public VeggiesDecorator(Pizza pizza, List<String> vegetableList) {
        super(pizza);
        this.vegetableList = vegetableList;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println(" with" + vegetableList);
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza capsicumAndCheesePizza = new VeggiesDecorator(
                new ExtraCheeseDecorator(new PaneerPizza(), "margharita")
                , Collections.singletonList("capsicum"));
        capsicumAndCheesePizza.makePizza();

        Pizza peppyPaneerWithExtraCheese = new ExtraCheeseDecorator(new ChickenPizza(), "pamesan");
        peppyPaneerWithExtraCheese.makePizza();
    }
}
