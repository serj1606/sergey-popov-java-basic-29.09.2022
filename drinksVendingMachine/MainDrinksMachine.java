package drinksVendingMachine;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainDrinksMachine extends Drinks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            DrinksMachine drinksMachine = null;
            DrinksMachine[] drinksMachines = DrinksMachine.values();
            while (true) {
                System.out.println("Please enter a drink from the list: COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA or type DONE for pay");
                String userValue = scanner.nextLine().toUpperCase(); // после того как клиент выберет все напитки нужно ввести слово "DONE" ((-:
                for (DrinksMachine type : drinksMachines) {
                    if (userValue.equals(type.toString())) {
                        drinksMachine = type;
                        Drinks.counterDrinks();
                        chosenDrink(drinksMachine);
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else if (userValue.equalsIgnoreCase("DONE")) {
                    System.out.println("You just get " + Drinks.counterDrinks + " drinks");
                    System.out.println("You have to pay " + priceDrinks + "$ to get your drinks");
                    return;
                } else {
                    System.out.println("Try again, wrong data!");
                }
            }
        } while (true);
    }

    public static void chosenDrink(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                System.out.println("Your " + DrinksMachine.COFFEE + " is ready");
                System.out.println(DrinksMachine.COFFEE + " price is " + coffee + "$");
                priceDrinks = priceDrinks.add(coffee);
                break;
            case TEA:
                System.out.println("Your " + DrinksMachine.TEA + " is ready");
                System.out.println(DrinksMachine.TEA + " price is " + tea + "$");
                priceDrinks = priceDrinks.add(tea);
                break;
            case LEMONADE:
                System.out.println("Your " + DrinksMachine.LEMONADE + " is ready");
                System.out.println(DrinksMachine.LEMONADE + " price is " + lemonade + "$");
                priceDrinks = priceDrinks.add(lemonade);
                break;
            case MOJITO:
                System.out.println("Your " + DrinksMachine.MOJITO + " is ready");
                System.out.println(DrinksMachine.MOJITO + " price is " + mojito + "$");
                priceDrinks = priceDrinks.add(mojito);
                break;
            case MINERAL_WATER:
                System.out.println("Your " + DrinksMachine.MINERAL_WATER + " is ready");
                System.out.println(DrinksMachine.MINERAL_WATER + " price is " + mineral_water + "$");
                priceDrinks = priceDrinks.add(mineral_water);
                break;
            case COCA_COLA:
                System.out.println("Your " + DrinksMachine.COCA_COLA + " is ready");
                System.out.println(DrinksMachine.COCA_COLA + " price is " + coca_cola + "$");
                priceDrinks = priceDrinks.add(coca_cola);
                break;
        }
    }
}
