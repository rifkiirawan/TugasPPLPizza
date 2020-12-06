package Pizza;

public class main {
    public static void main(String[] args){
        Pizza pizza = new PizzaBase();

        pizza = new Pineapple(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Bacon(pizza);
        pizza = new Peppers(pizza);
        pizza = new Onion(pizza);

        System.out.println("Pizza Orders :\n" + pizza.getDescription());
        System.out.println("Total Price : " + pizza.getPrice());
    }
}