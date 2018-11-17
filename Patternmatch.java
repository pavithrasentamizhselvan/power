package com.pat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatch{
public static void main(String[] args) {
	Pattern p=Pattern.compile("[0|91]?[7-9][0-9]{9}");
	PrintWriter out=null;
	try{
out=new PrintWriter("output1.txt");
	BufferedReader b=new BufferedReader(new FileReader("inner.txt"));
	
	String str=b.readLine();
	out.print("inside file");
	while(str!=null){
		Matcher m=p.matcher(str);
		while(m.find()){
			out.println(m.group());
		}str=b.readLine();
	}
	out.flush();
	}catch(Exception e){
		System.out.println("Exception occured");
	}
	
}
}
