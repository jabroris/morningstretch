package com.catcoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PositionFinder {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int deg = 0;
		
		BufferedReader reader;
		
		ArrayList<Position> positions = new ArrayList<Position>();
		
		try {
			reader = new BufferedReader(new FileReader("level2_2.in"));  
			
			//Reading the file and adding each command to arrayList of strings 
			//splitting the commands by space
			ArrayList<String> input = (ArrayList<String>)
		            reader.lines()
		            	  .skip(1)
		                  .flatMap(line -> Pattern.compile(" ").splitAsStream(line))
		                  .collect(Collectors.toList());
			
			for(int i = 0; i < input.size(); i++) {
				String dir = input.get(i);
				if(i == 0)
					x = Integer.parseInt(input.get(i));
				else if(i == 1) {
					y = Integer.parseInt(input.get(i));
					positions.add(new Position(x, y));
				} else {
					
					int steps = Integer.parseInt(input.get(++i));
					
					if((dir.equals("F")) && ((deg % 360) == 0)) {
						for(int j = 1; j <= steps; j++)
							positions.add(new Position(x+j, y));
						x += steps;
					}
					else if((dir.equals("F")) && ((deg % 360) == 90)) {
						for(int j = 1; j <= steps; j++)
							positions.add(new Position(x, y+j));
						y += steps;
					}
					else if((dir.equals("F")) && ((deg % 360) == 180)) {
						for(int j = 1; j <= steps; j++)
							positions.add(new Position(x-j, y));
						x -= steps;
					}
					else if((dir.equals("F")) && ((deg % 360) == 270)) {
						for(int j = 1; j <= steps; j++)
							positions.add(new Position(x, y-j));
						y -= steps;
					}
					else if(dir.equals("T"))
						deg = (deg + 90 * steps) % 360;
				}
			}

			positions.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}

class Position {
	int x;
	int y;
	
	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x + " " + y;
	}
}
