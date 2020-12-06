package Pizza;

public abstract class Toppings implements Pizza {
    @Override
    public String getDescription(){
        return "Toppings";
    }
}
