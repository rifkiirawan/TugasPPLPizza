package Pizza;

public class Onion extends Toppings{
    private Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Onion, Price: 3p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }    
}
