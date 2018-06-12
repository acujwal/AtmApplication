package com.company;

import java.util.Scanner;

import static com.company.Account.checkID;

public class ATM {

    static Scanner keyboard = new Scanner(System.in);
    static String acctNum, pwd, result;
    static double oldBalance, newBalance, deposit, withdraw;
    static int choose;

    public static void userInput() {
        for (int run = 0; run < 3; run++) {
            System.out.println("Enter your account number");
            acctNum = keyboard.nextLine();
            System.out.println("Enter your account password");
            pwd = keyboard.nextLine();

            result = checkID(acctNum, pwd);
            if (!result.equals("ERROR")) {
                break;
            } else if (run == 2) {// you cannot try to log in anymore than 3
                // times
                System.out.println("MAXIMUM TRIES EXCEEDED");
                return;
            }

        }
        menu();
    }


    public static int menu() {
        System.out
                .println("Choose one of the following: \n1.Balance Inquiry \n2.Deposit\n3.Withdraw\n4.Log Out");
        choose = keyboard.nextInt();

        if (choose == 1) {// 1. Display Balance
            displayBalance();
            menu();
            return 1;

        }
        if (choose == 2) {// 2. Deposit
            deposit();
            menu();
            return 2;

        }
        if (choose == 3) {// 3. Withdraw
            withdraw();
            menu();
            return 3;

        }
        if (choose == 4) {// 4. Log out
            System.out.println("You are logged out.");
            return 4;

        }
        if (choose <= 5) {// type in anything greater than 4 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 5;
        }
        if (choose >= 1) {// type in anything less than 1 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 6;
        }
        return choose;

    }

    public static double deposit() {
        System.out.println("How much would you like to deposit?");
        deposit = keyboard.nextInt();
        System.out.println((deposit + oldBalance) == newBalance);// deposit money into balance
        return 2;
    }

    public static double displayBalance() {
        System.out.println("Total balance is: $" + oldBalance);
        oldBalance = 0.00;
        return 1;
    }

    public static double withdraw() {
        System.out.println("How much would you like to withdraw?");
        withdraw = keyboard.nextInt();
        System.out.println(newBalance + withdraw);// withdraw money from balance
        return 3;
    }
}