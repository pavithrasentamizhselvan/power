package com.pat;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Directories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
Pattern p=Pattern.compile("[a-zA-Z0-9-$.]+[.]xml");
File f=new File("D://Notepad++");
String[] s=f.list();
for(String s1:s){
	Matcher m=p.matcher(s1);
	if(m.find() && m.group().equals(s1)){
		count++;
		System.out.println(s1);
	}
}
	System.out.println("count is"+count);}

}
