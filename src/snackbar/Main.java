package snackbar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello this is snackbar");
        // Vending Machine
        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine supplies = new VendingMachine("supplies");
        // Snack
        Snack pringles = new Snack("Pringles", 10, 2.75, food.getId());
        Snack coke = new Snack("Coke", 25, 1.25, drink.getId());
        Snack pen = new Snack("Pen", 50, 0.50, supplies.getId());
        // Customer
        Customer Jane = new Customer("Jane", 37.25);
        Customer Bob = new Customer("Bob", 28.14);
        // Actions

        // System out
        System.out.println(Jane.getName() + " cash on hand " + Jane.getCash());
        System.out.println("Quantity of " + coke.getName() + " is " + coke.getQuantity());
        // Buys 1 coke
        Jane.buySnacks(1.25);
        coke.buySnacks(1);
        //
        System.out.println(Jane.getName() + " cash on hand " + Jane.getCash());
        System.out.println("Quantity of " + coke.getName() + " is " + coke.getQuantity());

    }
}