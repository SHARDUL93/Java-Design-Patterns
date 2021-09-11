package com.shardul.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	Dao dao = null;

	@Override
	public Dao createDao(String type) {
		if (type.equals("emp")) {
			dao = new DBEmpDao();
		} else if (type.equals("dept")) {
			dao = new DBDeptDao();
		}

		return dao;
	}

}
