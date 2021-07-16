package com.catcoder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Hyperloop {

	public static void main(String[] args) {
		
		try {
			BufferedReader input = new BufferedReader(new FileReader("level1-4.txt"));
			int locationsCount = Integer.parseInt(input.readLine());
			HashMap<String, Location> locations = new HashMap<String, Location>();
			
			input.lines()
				.limit(locationsCount)
				.map(line -> line.split(" "))
				.forEach(s -> locations.put(s[0], new Location(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]))));
						
			locations.forEach((k, v) -> System.out.println(k + " " + v.toString()));
			
			String[] cities = input.readLine().split(" ");
			Location start = locations.get(cities[0]);
			Location end = locations.get(cities[1]);
			
			Hyperloop hl = new Hyperloop(); 
			
			long timeFromAtoB = hl.timeFromAtoB(hl.distance(start, end));
			
			System.out.println(timeFromAtoB);
			
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double distance(Location start, Location end) {
		return Math.sqrt(Math.pow(start.x - end.x, 2) 
						+ Math.pow(start.y - end.y, 2));
	}
	
	public long timeFromAtoB(double distance) {
		return Math.round((distance/ 250) + 200);
	}
}
	
class Location {
	String name;
	int x;
	int y;
	
	Location(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return name + " " + x + " " + y;
	}
}

