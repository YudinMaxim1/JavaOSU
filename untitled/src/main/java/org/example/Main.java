package org.example;


import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount bankAccount_1 = new BankAccount(1000) {
            @Override
            public void topUp(int addition, LocalDate lastIncome) throws Exception {
            }
        };
        CardAccount cardAccount_1 = new CardAccount(1000);
        DepositAccount depositAccount_1 = new DepositAccount(1000, LocalDate.of(2024, 1, 13));

        System.out.println("Bank account:");
        bankAccount_1.accountCheck();
        System.out.println("Card account:");
        cardAccount_1.accountCheck();
        System.out.println("Deposit account:");
        depositAccount_1.accountCheck();

        try {

            System.out.println("\n**Bank account**");
            System.out.println("Input a number of addition money: ");
            int addition = input.nextInt();
            bankAccount_1.topUp(addition);
            System.out.println("Input a number of decrease money: ");
            int decrease = input.nextInt();
            bankAccount_1.debit(decrease);

            System.out.println("\n**Card account**");
            System.out.println("Input a number of addition money: ");
            addition = input.nextInt();
            cardAccount_1.topUp(addition);
            System.out.println("Input a number of decrease money: ");
            decrease = input.nextInt();
            cardAccount_1.debit(decrease);

            System.out.println("\n**Deposit account**");
            System.out.println("Input a number of addition money: ");
            addition = input.nextInt();
            depositAccount_1.topUp(addition,  LocalDate.now());
            System.out.println("Input a number of decrease money: ");
            decrease = input.nextInt();
            depositAccount_1.debit(decrease);


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("\nBank account:");
        bankAccount_1.accountCheck();
        System.out.println("Card account:");
        cardAccount_1.accountCheck();
        System.out.println("Deposit account:");
        depositAccount_1.accountCheck();
    }
}