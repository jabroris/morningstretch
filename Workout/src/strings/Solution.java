package strings;

import java.util.HashMap;

public class Solution 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println(1 + 1 + "4" + 2 + 1);
//		Solution.Cell c = new Solution.Cell();
//		HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("0,0", "5");
//		hm.put("0,1", "99");
//		hm.put("0,2", "= 5 + 2  + 3+11+66+59+85+45+52");
//		c.set(hm);
//		System.out.println("Pos 0,2 result = " + c.get("0,2"));
//		System.out.println("Pos 0,0 result = " + c.get("0,0"));
	}

	static class Cell 
	{
		HashMap<String, String> cell = new HashMap<String, String>();
		
		public int get(String cellPos) 
		{
			String cellValue = cell.get(cellPos);

			if(cellValue.contains("="))
				return calc(cellValue.substring(cellValue.indexOf('=')+1));
			else
				return Integer.parseInt(cellValue);
		}
		
		public void set(HashMap<String, String> cell)
		{
			this.cell = cell;
		}
		
		public int calc(String regex)
		{
			int sum = 0;
			regex = regex.replaceAll(" ", "");
			String [] numbers = regex.split("[+]");
			
			for(int i = 0; i < numbers.length; i++)
			{
				sum += Integer.parseInt(numbers[i]);
			}
			return sum;
		}
	}
}
