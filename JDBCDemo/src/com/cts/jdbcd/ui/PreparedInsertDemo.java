package com.cts.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedInsertDemo {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
		
			String jobId, jobTitle;
			
			System.out.print("Enter job id : ");
			jobId = scan.next();
			System.out.print("Enter job title : ");
			jobTitle = scan.next();
			
			String sql = "UPDATE jobs SET job_title = ? WHERE job_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, jobTitle);
			ps.setString(2, jobId);

			ps.executeUpdate();

			System.out.println("Row Updated.");
		} catch (SQLException e) {
			System.err.println("Could not update");
			e.printStackTrace();
		} 
	}

}
