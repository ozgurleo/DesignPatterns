public class Menu {
    private String name;
    private Drink drink;
    private Size sizeOfFries;
    private String burgerType;

    public void setName(String name) {
        this.name = name;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setSizeOfFries(Size sizeOfFries) {
        this.sizeOfFries = sizeOfFries;
    }

    public void setBurgerType(String burgerType){
        this.burgerType=burgerType;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", drink=" + drink +
                ", sizeOfFries=" + sizeOfFries +
                ", burgerType='" + burgerType + '\'' +
                '}';
    }
}
