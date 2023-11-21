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

        out.print (myAccount.name);
        out.print (" (");
        out.print (myAccount.address);
        out.print (") has $");
        out.print (myAccount.balance);
        out.println ();

        out.print(yourAccount.name) ;
        out.print(" (");
        out.print(yourAccount.address);
        out.print(") has $");
        out.print(yourAccount.balance);
    }
}
