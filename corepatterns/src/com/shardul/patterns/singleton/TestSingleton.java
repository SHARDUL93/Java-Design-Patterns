package com.shardul.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		DateUtil dateUtil1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/Dell/Documents/workspace-sts-3.9.12.RELEASE/Java-Design-Patterns/testSingleton/dateUtil.ser")));
		oos.writeObject(dateUtil1);
		
		DateUtil dateUtil1_read = null;
		
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/Dell/Documents/workspace-sts-3.9.12.RELEASE/Java-Design-Patterns/testSingleton/dateUtil.ser")));
		dateUtil1_read = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();
		
		System.out.println("TestSingleton");
		
		System.out.println("dateUtil1 == dateUtil2 : "+(dateUtil1==dateUtil2));
		
		System.out.println("dateUtil1 == dateUtil1_read : "+(dateUtil1==dateUtil1_read));
		
		

	}

}
