package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SetupPropFinder 
{
	public static void main(String [] args)
	{
		File file = new File("C:\\Users\\blagoev\\Documents\\Jordan\\2020\\AWS01_setup_20191220-2.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String str;
			
			while((str = in.readLine()) != null)
			{
				if(str.contains("RIGHT DIGITS") || str.contains("LABEL") || str.contains("ACTIVE") || str.contains("INTERVAL") || str.contains("CONTENT1"))
					System.out.println(str);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
