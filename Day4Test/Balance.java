package Day4Test;

import java.util.*;

public class Balance {
    private long balance;

    public static void main(String[] args) {
        long amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance");
        Balance obj = new Balance();
        obj.balance = sc.nextLong();
        System.out.println("Balance = " + obj.balance);
        System.out.println("Enter no of Operations");
        int noOfOperations = sc.nextInt();
        int choice;
        for (int i = 0; i < noOfOperations; i++) {
            //System.out.println("Enter Choice \n1. Credit\n2. Debit");
            choice = sc.nextInt();
           //  System.out.println("Enter Amount");
            amount = sc.nextLong();
            if (choice == 1) {

                //System.out.println(obj.creditBalance(amount));
                System.out.println(obj.balance);
            }

            else if (choice == 2) {

                if (amount > obj.balance) {
                    System.out.println("Insufficient Funds");

                } else {
                    System.out.println(obj.debitBalance(amount));
                     System.out.println("Balance = "+ obj.balance);
                }
            } else
                break;
        }
        sc.close();
    }

    long creditBalance(long amount) {
        balance += amount;
        return balance;
    }

    long debitBalance(long amount) {
        balance -= amount;
        return balance;
    }
}
