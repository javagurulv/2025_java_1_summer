package org.javaguru.mentor.lesson_15_multithreading.lessoncode;

public class BankAccountThreadApp {

	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount(0);
		//BankAccount bankAccount2 = new BankAccount(0);

		Thread thread1 = new Thread(new AddMoneyThread(bankAccount1));
		Thread thread2 = new Thread(new RemoveMoneyThread(bankAccount1));

		long before = System.currentTimeMillis();

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		long after = System.currentTimeMillis();

		//var result = bankAccount1.getMoney() + bankAccount2.getMoney();
		System.out.println("Bank Account money = " + bankAccount1.getMoney());
		//System.out.println("Bank Account money = " + result);
		System.out.println("Time = " + (after - before));

	}
}
