package Latihan;

import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Adjie Putra Ramdhani";
        myAccount.address = "Jalan Beringin";
        myAccount.balance = 99.99;

        yourAccount.name = "Rijan";
        yourAccount.address = "bulcin";
        yourAccount.balance = 10.99;

        myAccount.display();

        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));
        out.println(" interest ");
        yourAccount.display();

        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount =
                yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" interest ");
    }
}
