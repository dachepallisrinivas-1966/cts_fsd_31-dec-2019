/* Properties */
package com.cts.cd.ui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class App10 {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("name",  "Srinivas");
		p.setProperty("email", "dachepallisrinivas@gmail.com");
		p.setProperty("phone", "9247175823");
		
		for(Object key : p.keySet()) {
			System.out.printf("%s : %s\n", key, p.get(key));
		}
		
		p.store(new FileWriter("mydetails.properties"), "My Details");

		Properties p2 = new Properties();
		p2.load(new FileReader("mydetails.properties"));
		
		for(Object key : p2.keySet()) {
			System.out.printf("%s : %s\n", key, p2.get(key));
		}
		
	}

}
