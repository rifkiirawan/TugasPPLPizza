package Pizza;

public class Chicken extends Toppings{
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Chicken, Price: 5p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
