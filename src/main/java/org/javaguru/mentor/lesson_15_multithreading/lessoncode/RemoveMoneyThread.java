package org.javaguru.mentor.lesson_15_multithreading.lessoncode;

public class RemoveMoneyThread implements Runnable {

	private BankAccount bankAccount;

	public RemoveMoneyThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			bankAccount.remove(1);
			//System.out.println(bankAccount.getMoney());
		}
	}
}
