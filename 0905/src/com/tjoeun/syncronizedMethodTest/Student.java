package com.tjoeun.syncronizedMethodTest;

public class Student extends Thread{

	
	public Student(String name) {
		super(name);
	}

	@Override
	public void run() {

		String title = LibraryMain.library.lenBook();
	}
	
	
}
