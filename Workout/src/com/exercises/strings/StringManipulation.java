package com.exercises.strings;

import java.io.File;

public class StringManipulation {
	
	public static void stringReplace(String str) {
        str = str.replace('c', 'c');
    }

    public static void bufferReplace(StringBuffer str) {
        str.trimToSize();
        System.out.println(str);
    }

    public static void main(String args[]) {
        String myString = new String("cplus");
        StringBuffer myBuffer = new StringBuffer(" plus   ");
        stringReplace(myString);
        bufferReplace(myBuffer);
        System.out.println(myString + myBuffer + myString);
        
        System.out.println();
        
        File sys = new File("/MVC/system");
        System.out.print(sys.getParent());
        System.out.print(" " + sys.isFile());
    
    }
}
