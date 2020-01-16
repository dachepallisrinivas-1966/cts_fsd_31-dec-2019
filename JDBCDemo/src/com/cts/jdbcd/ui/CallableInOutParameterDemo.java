package com.cts.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableInOutParameterDemo {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			CallableStatement cs = con.prepareCall("{call greet_the_job(?)}");
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setString(1, "S_PR");
			cs.execute();
			String result = cs.getString(1);
			
			System.out.println("Procedure Executed - INOUT parameters : " + result);
		} catch (SQLException e) {
			System.err.println("Could not execute");
			e.printStackTrace();
		} 

	}

}
