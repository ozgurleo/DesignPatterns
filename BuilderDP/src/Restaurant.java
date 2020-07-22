public class Restaurant {
    public static void main(String[] args) {
        Menu kidsMenu1= new KidsMenuBuilder()
                .setDrink(Drink.Cola)
                .setBurgerType("beef")
                .setSizeOfFires(Size.Large)
                .setName("Happy Meal")
                .getMenu();
        System.out.println(kidsMenu1);
    }
}
