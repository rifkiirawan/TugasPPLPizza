package Pizza;

public class Peppers extends Toppings{
    private Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Peppers, Price: 2p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
