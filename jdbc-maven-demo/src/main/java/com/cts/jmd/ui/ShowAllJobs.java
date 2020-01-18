package com.cts.jmd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ShowAllJobs {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			PreparedStatement ps = con.prepareStatement("select job_id, job_title from jobs");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-15s%-40s\n", rs.getString("job_id"), rs.getString("job_title"));
			}
			
			
		} catch (SQLException e) {
			System.err.println("Could not retrieve.");
			e.printStackTrace();
		} 

	}

}
