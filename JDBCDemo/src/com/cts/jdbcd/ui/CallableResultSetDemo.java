package com.cts.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableResultSetDemo {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			CallableStatement cs = con.prepareCall("{call get_employees_for_department(?)}");
			cs.setInt(1, 50);
			cs.execute();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				System.out.printf("%-6s%-15s%10s%5s\n", rs.getString("employee_id"), rs.getString("first_name"), rs.getString("salary"), rs.getString("department_id"));
			}
			
			System.out.println("Procedure Executed - Returning ResultSet");
		} catch (SQLException e) {
			System.err.println("Could not execute");
			e.printStackTrace();
		} 

	}

}
