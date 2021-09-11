package com.shardul.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	
	//eager initialization
	//private static DateUtil instance = new DateUtil();
	
	private static volatile DateUtil instance ;
	
	//initialization using static block
	/*
	 * static { instance = new DateUtil(); }
	 */
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		
		if(instance == null) {
		synchronized(DateUtil.class) {
		//lazy initialization
		  if(instance == null) { instance = new DateUtil(); }
			}
		}
		 
		return instance;
		
	}
	
	//called during deserialization to return the same instance
	protected Object readResolve() {
		return instance;
	}
	
	//if some child class tries to clone DateUtil.class, CloneNotSupportedException is thrown
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	

}
