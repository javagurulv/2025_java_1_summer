package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

class BankAccount {

    private String owner;
    private int money;

    BankAccount() {
        this.owner = "Mr. X";
        this.money = 0;
    }

    BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

    void addMoney(int moneyToAdd) {
        this.money = this.money + moneyToAdd;
    }

}
