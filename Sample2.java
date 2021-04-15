package com.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<String ,Integer> frameWorks= 
						 new HashMap<String,Integer>();
	frameWorks.put("APPLE", 20);
	frameWorks.put("BRINJAL", 30);
	frameWorks.put("MANGO", 15);
	frameWorks.put("GRAPE", 35);
	frameWorks.put("ORANGE", 45);
	frameWorks.put("DATE", 35);
	
	Map<String,Integer> sorted = frameWorks.entrySet()
								 .stream().sorted(Entry.comparingByValue())
								 .collect(Collectors
								 .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
	System.out.println("Sorted list"+sorted);							 
	}

}

