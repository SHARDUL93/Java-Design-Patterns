package com.shardul.patterns.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {

		System.out.println("TestAbstractFactory");

		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
		
		DaoAbstractFactory daf2 = DaoFactoryProducer.produce("db");
		Dao dao2 = daf2.createDao("emp");
		dao2.save();
		
		Dao dao3 = daf2.createDao("dept");
		dao3.save();

	}

}
