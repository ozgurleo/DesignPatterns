public class KidsMenuBuilder implements MenuBuilder{

    private Menu menu= new Menu();

    @Override
    public MenuBuilder setName(String name) {
        menu.setName(name);
        return this;
    }

    @Override
    public MenuBuilder setBurgerType(String burgerType) {
        menu.setBurgerType(burgerType);
        return this;
    }

    @Override
    public MenuBuilder setDrink(Drink drink) {
        menu.setDrink(drink);
        return this;
    }

    @Override
    public MenuBuilder setSizeOfFires(Size sizeOfFires) {
        menu.setSizeOfFries(sizeOfFires);
        return  this;
    }

    @Override
    public Menu getMenu() {
        return menu;
    }


}
