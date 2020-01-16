package com.cts.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ShowAllJobs2 {

	public static void main(String[] args) {
		try (
				Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			) {
		
			PreparedStatement ps = con.prepareStatement("select job_id, job_title from jobs", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = ps.executeQuery();
			
			System.out.println("Jobs in normal order");
			System.out.println("-------------------------");
			while(rs.next()) {
				System.out.printf("%-15s%-40s\n", rs.getString("job_id"), rs.getString("job_title"));
			}
			
			System.out.println("Jobs in reverse order");
			System.out.println("---------------------");
			while(rs.previous()) {
				System.out.printf("%-15s%-40s\n", rs.getString("job_id"), rs.getString("job_title"));
			}
			
		} catch (SQLException e) {
			System.err.println("Could not retrieve.");
			e.printStackTrace();
		} 

	}

}
