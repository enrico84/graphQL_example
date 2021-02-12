package com.graphql.java.news.utility;

import java.math.BigDecimal;

public class Utility {
	
	public static String getTid() {
		String lettere = "ABCDEFGHILMNOPQRSTUVZ";
		StringBuffer tid = new StringBuffer("");

		for (int i = 0; i < 10; i++) {
			tid.append(lettere.toLowerCase().charAt(
					(int) Math.floor(Math.random() * 1000) % 21));
		}
		tid.append("_");
		tid.append((int) Math.floor(Math.random() * 1000));

		return tid.toString();
	} 
	
	public static Double getDouble(Object obj){
		if(obj==null )return null;
		BigDecimal bd= new BigDecimal(""+obj);
		return bd.doubleValue();
	}
	
	public static Integer getInteger(Object obj){
		if(obj==null )return null;
		BigDecimal bd= new BigDecimal(""+obj);
		return bd.intValue();
	}
	
	
	public static Long getLong(Object obj){
		if(obj==null )return null;
		BigDecimal bd= new BigDecimal(""+obj);
		return bd.longValue();
	}
	public static Float getFloat(Object obj){
		if(obj==null )return null;
		BigDecimal bd= new BigDecimal(""+obj);
		return bd.floatValue();
	}
	

}
