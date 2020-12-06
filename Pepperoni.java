package Pizza;

public class Pepperoni extends Toppings{
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Pepperoni, Price: 4p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}