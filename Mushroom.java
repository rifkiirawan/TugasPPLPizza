package Pizza;

public class Mushroom extends Toppings{
    private Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Mushroom, Price: 3p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
