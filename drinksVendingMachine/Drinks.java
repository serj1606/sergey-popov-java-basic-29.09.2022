package drinksVendingMachine;

import java.math.BigDecimal;

public class Drinks {

    public static final BigDecimal coffee = new BigDecimal("10.5");
    public static final BigDecimal tea = new BigDecimal("8.6");
    public static final BigDecimal lemonade = new BigDecimal("11.9");
    public static final BigDecimal mojito = new BigDecimal("12.7");
    public static final BigDecimal mineral_water = new BigDecimal("5");
    public static final BigDecimal coca_cola = new BigDecimal("8.8");
    public static int counterDrinks = 0;

    public static void counterDrinks() {
        counterDrinks++;
    }

    public static BigDecimal priceDrinks = new BigDecimal("0");
}

