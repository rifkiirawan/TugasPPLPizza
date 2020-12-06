package Pizza;

public class PizzaBase implements Pizza {
    @Override
    public String  getDescription(){
        return "Base, Price = 5p \n";
    }
    public int getPrice(){
        return 5;
    }
}
