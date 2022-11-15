package Burger;

public class Burger {
    String bun, doubleMeat, meat, cheese, greens, mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise)    {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        /*System.out.println("composition of a regular burger: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", "
         + mayonnaise);  так по заданию нужно сделать*/
    }

    // так без логики в конструкторе
    public void printRegularBurger() {
        System.out.println("composition of a regular burger: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }


    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        /*System.out.println("composition of the diet burger: " + bun + ", " + meat + ", " + cheese + ", " + greens);
        так по заданию нужно сделать*/
    }

    // так без логики в конструкторе
    public void printDietBurger() {
        System.out.println("composition of the diet burger: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }


    public Burger(String bun, String doubleMeat, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        /*System.out.println("composition of the diet burger: " + bun + ", " + meat + ", " + cheese + ", " + greens);
        так по заданию нужно сделать*/
    }

    // так без логики в конструкторе
    public void printDoubleBurger() {
        System.out.println("composition of a double burger: " + bun + ", " + doubleMeat + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);

    }
}









