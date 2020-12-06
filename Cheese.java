package Pizza;

public class Cheese extends Toppings{
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Cheese, Price: 1p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
