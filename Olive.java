package Pizza;

public class Olive extends Toppings{
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Olive, Price: 4p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}