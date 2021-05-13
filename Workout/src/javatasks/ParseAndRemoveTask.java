package javatasks;

import java.util.LinkedList;
import java.util.List;

public class ParseAndRemoveTask {

	public static void removeOdds(List<String> strings) {
		for(final String s : strings) {
			final var i = Integer.parseInt(s);
			
			if(i%2 == 1) {
				strings.remove(s);
			}
		}
	}
	
	public static void main(String[] args) {
		removeOdds(new LinkedList<String>(List.of("1", "2", "3", "4", "5")));
	}
}
