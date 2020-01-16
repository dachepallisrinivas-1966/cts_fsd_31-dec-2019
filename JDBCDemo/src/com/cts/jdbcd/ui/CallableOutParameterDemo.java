package com.cts.jdbcd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableOutParameterDemo {

	public static void main(String[] args) {
		try (
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			CallableStatement cs = con.prepareCall("{call get_count_for_department(?, ?)}");
			cs.setInt(1, 20);
			cs.registerOutParameter(2, Types.INTEGER);
			
			cs.execute();
			int count = cs.getInt(2);
			
			System.out.println("Procedure Executed - OUT parameters : No. of Employee in Department 20 =  " + count);
		} catch (SQLException e) {
			System.err.println("Could not execute");
			e.printStackTrace();
		} 

	}

}
