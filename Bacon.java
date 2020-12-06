package Pizza;

public class Bacon extends Toppings{
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + "Bacon, Price: 5p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
