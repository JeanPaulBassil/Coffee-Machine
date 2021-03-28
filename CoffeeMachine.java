package coffeeMachine;

import java.util.Scanner;

class coffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Water = 400;                                          // STARTING AND ENDING VARIABLES
        int Milk = 540;
        int CoffeeBeans = 120;
        int DisposableCups = 9;
        int Money = 550;
        boolean machineOn = true;


        while (machineOn) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.next();
            System.out.println();
            switch (action) {
                case "buy":                                                    // IN CASE OF SOMEONE WANTING TO BUY
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back -to main menu:");
                    String coffeeType = scanner.next();
                    switch (coffeeType) {
                        case "1":                                                // IN CASE OF BUYING ESPRESSO
                            if (Water > 250 && CoffeeBeans > 16 && DisposableCups > 1) {

                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                Water = Water - 250;
                                CoffeeBeans = CoffeeBeans - 16;
                                DisposableCups = DisposableCups - 1;
                                Money = Money + 4;
                            } else {
                                if (Water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                } else if (CoffeeBeans < 16) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                    System.out.println();
                                } else if (DisposableCups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    System.out.println();
                                }

                            }
                            break;
                        case "2":                                                    // IN CASE OF BUYING LATTE
                            if (Water > 350 && CoffeeBeans > 20 && DisposableCups > 1 && Milk > 75) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                Water = Water - 350;
                                Milk = Milk - 75;
                                CoffeeBeans = CoffeeBeans - 20;
                                DisposableCups = DisposableCups - 1;
                                Money = Money + 7;
                            } else {
                                if (Water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                } else if (CoffeeBeans < 20) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                    System.out.println();
                                } else if (DisposableCups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    System.out.println();
                                } else if (Milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                    System.out.println();
                                }
                            }
                            break;
                        case "3":                                                  // IN CASE OF BUYING CAPPUCCINO
                            if (Water > 200 && CoffeeBeans > 12 && DisposableCups > 1 && Milk > 100) {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                Water = Water - 200;
                                Milk = Milk - 100;
                                CoffeeBeans = CoffeeBeans - 12;
                                DisposableCups = DisposableCups - 1;
                                Money = Money + 6;
                            } else {
                                if (Water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                } else if (CoffeeBeans < 12) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                    System.out.println();
                                } else if (DisposableCups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    System.out.println();
                                } else if (Milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                    System.out.println();
                                }
                            }
                            break;
                        case "back":
                            break;


                    }

                    break;
                case "fill":                                                     // IN CASE OF SOMEONE WANTING TO FILL
                    System.out.println("Write how many ml of water do you want to add:");
                    Water = Water + scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    Milk = Milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    CoffeeBeans = CoffeeBeans + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    DisposableCups = DisposableCups + scanner.nextInt();

                    break;
                case "take":                                                   // IN CASE OF SOMEONE WANTING TO TAKE THE MONEY
                    System.out.println("I gave you $" + Money);
                    System.out.println();
                    Money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.println(Water + " of water");
                    System.out.println(Milk + " of milk");
                    System.out.println(CoffeeBeans + " of coffee beans");
                    System.out.println(DisposableCups + " of disposable cups");
                    System.out.println("$" + Money + " of money");
                    System.out.println();
                    break;
                case "exit":
                    machineOn = false;
            }


        }
    }
}