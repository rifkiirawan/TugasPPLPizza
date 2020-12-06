package Pizza;

public class Tuna extends Toppings{
    private Pizza pizza;

    public Tuna(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Tuna, Price: 4p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}