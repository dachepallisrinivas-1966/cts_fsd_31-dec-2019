package com.cts.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableInParameterDemo {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			CallableStatement cs = con.prepareCall("{call increase_max_salary_for_job(?,?)}");
			cs.setString(1, "S_PR");
			cs.setDouble(2, 1000);
			cs.execute();
			
			System.out.println("Procedure Executed - IN parameters");
		} catch (SQLException e) {
			System.err.println("Could not execute");
			e.printStackTrace();
		} 

	}

}
