package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

class BankAccountApplication {

    public static void main(String[] args) {

        BankAccount bankAccount0 = new BankAccount();

        BankAccount bankAccount1 = new BankAccount("Vasja");
        BankAccount bankAccount2 = new BankAccount("Petja");
        BankAccount bankAccount3 = new BankAccount("Masha");

        BankAccount bankAccount4 = new BankAccount("John", 100);
        BankAccount bankAccount5 = new BankAccount("Donald", 1000000);


        String ba0Owner = bankAccount0.getOwner();
        System.out.println("BA0 owner = " + ba0Owner);

        String ba1Owner = bankAccount1.getOwner();
        System.out.println("BA1 owner = " + ba1Owner);

        String ba5Owner = bankAccount5.getOwner();
        int ba5Money = bankAccount5.getMoney();
        System.out.println("BA5 owner = " + ba5Owner + " money = " + ba5Money);


        bankAccount5.addMoney(100);
        bankAccount5.addMoney(200);
        bankAccount5.addMoney(300);

        System.out.println("BA5 money = " + bankAccount5.getMoney());
    }

}
