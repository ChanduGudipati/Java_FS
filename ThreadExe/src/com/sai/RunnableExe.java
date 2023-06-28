package com.sai;


interface Test{
	void add();
}

class Abc implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
		
}
public class RunnableExe  {

	public static void main(String[] args) {
	
		//Abc t1 = new Abc();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <9; i++) {
					System.out.println("from  " + Thread.currentThread().getName() + " " + i);
				}
				
			}
		};
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <9; i++) {
					System.out.println("from  " + Thread.currentThread().getName() + " " + i);
				}
				
			}
		};
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run1);
		t1.start();
		t2.start();
	
	
	}
}
