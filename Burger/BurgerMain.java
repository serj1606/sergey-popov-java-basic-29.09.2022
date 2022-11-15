package Burger;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("bun", "meat", "cheese", "greens", "mayonnaise");
        Burger dietBurger = new Burger("bun", "meat", "cheese", "greens");
        Burger doubleBurger = new Burger("bun", "double", "meat", "cheese", "greens", "mayonnaise");

        regularBurger.printRegularBurger();
        dietBurger.printDietBurger();
        doubleBurger.printDoubleBurger();

    }
}


