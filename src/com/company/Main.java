package com.company;

import java.util.Scanner;

public class Main {
    int water;
    int milk;
    int beans;
    int cups;
    int money;

    public Main() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main cf = new Main();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        boolean exit = false;
        while (!exit) {
            String input = sc.nextLine();
            if(input.equals("exit")){
                exit = true;
            } else {

                switch (input) {
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso," +
                                " 2 - latte, 3 - cappuccino, back - to main menu:");
                        cf.Buy(sc.nextLine());
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    case "take":
                        cf.Take();
                        break;
                    case "remaining":
                        cf.Remaining();
                        break;
                    case "fill":
                        for (int i = 1; i < 5; i++) {
                            if (i == 1){
                                System.out.println("Write how many ml of water you want to add:");
                                cf.fill(sc.nextLine(), i);
                            } else {
                                cf.fill(sc.nextLine(), i);
                            }
                        }
                        break;
                }
            }
        }
    }
    public void Buy(String input) {

        switch (input) {
            case "1":
                Espresso();
                break;
            case "2":
                Latte();
                break;
            case "3":
                Cappuccino();
                break;
            case "back":
                break;
        }
    }
    public void Remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println(money + " of money");
    }
    public void Take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    public void fill(String input, int i) {
        switch (i) {
            case 1:
                water += Integer.parseInt(input);
                System.out.println("Write how many ml of milk you want to add:");
                break;
            case 2:
                milk += Integer.parseInt(input);
                System.out.println("Write how many grams of coffee beans you want to add:");
                break;
            case 3:
                beans += Integer.parseInt(input);
                System.out.println("Write how many disposable cups of coffee you want to add:");
            case 4:
                cups += Integer.parseInt(input)/2;
        }
    }
    public void Espresso () {
        int water1 = water;
        int beans1 = beans;
        int money1 = money;
        int milk1 = milk;
        int cups1 = cups;
        water1 -= 250;
        beans1 -= 16;
        money1 += 4;
        cups1 -= 1;
        if (water1 <= 0) {
            System.out.println("Sorry, not enough water!");
        } else if (beans1 <= 0) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups1 <= 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water = water1;
            beans = beans1;
            milk = milk1;
            money = money1;
            cups = cups1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
    public void Latte () {
        int water1 = water;
        int beans1 = beans;
        int money1 = money;
        int milk1 = milk;
        int cups1 = cups;
        water1 -= 350;
        milk1 -= 75;
        beans1 -= 20;
        money1 += 7;
        cups1 -= 1;
        if (water1 <= 0) {
            System.out.println("Sorry, not enough water!");
        } else if (milk1 <= 0) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans1 <= 0) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups1 <= 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water1;
            beans = beans1;
            milk = milk1;
            money = money1;
            cups = cups1;
        }
    }
    public void Cappuccino() {
        int water1 = water;
        int beans1 = beans;
        int money1 = money;
        int milk1 = milk;
        int cups1 = cups;
        water1 -= 200;
        milk1 -= 100;
        beans1 -= 12;
        money1 += 6;
        cups1 -= 1;
        if (water1 <= 0) {
            System.out.println("Sorry, not enough water!");
        } else if (milk1 <= 0) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans1 <= 0) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups1 <= 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water = water1;
            beans = beans1;
            milk = milk1;
            money = money1;
            cups = cups1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}
