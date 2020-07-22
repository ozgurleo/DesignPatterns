public interface MenuBuilder {
    MenuBuilder setName(String name);
    MenuBuilder setBurgerType(String burgerType);
    MenuBuilder setDrink(Drink drink);
    MenuBuilder setSizeOfFires(Size sizeOfFires);
    Menu getMenu();
}
