package Pizza;

public class Pineapple extends Toppings{
    private Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Pineapple, Price: 2p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }    
}
