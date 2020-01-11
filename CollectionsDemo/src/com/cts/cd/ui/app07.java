package com.cts.cd.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class app07 {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("java",  "Language");
		hm.put("dotnet", "Framework");
		hm.put("c#", "Language");
		for(String key : hm.keySet()) 
			System.out.printf("%s : %s\n", key, hm.get(key));
		System.out.println("---------------------------------------");
		
		Map<String, String> lhm = new LinkedHashMap<>();
		lhm.put("java",  "Language");
		lhm.put("dotnet", "Framework");
		lhm.put("c#", "Language");
		for(String key : lhm.keySet()) 
			System.out.printf("%s : %s\n", key, lhm.get(key));
		System.out.println("---------------------------------------");

		Map<String, String> tm = new TreeMap<>();
		tm.put("java",  "Language");
		tm.put("dotnet", "Framework");
		tm.put("c#", "Language");
		for(String key : tm.keySet()) 
			System.out.printf("%s : %s\n", key, tm.get(key));
		System.out.println("---------------------------------------");

	}

}
