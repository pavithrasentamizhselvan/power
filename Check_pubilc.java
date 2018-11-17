package check.org;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Check_pubilc implements Serializable {
	transient String name="pavi";
	/*2 methods for customize private writeObject(ObjectOutputStream o)throws Exception
	 * 
	 * */private void writeObject(ObjectOutputStream os)throws Exception{
		 String newpavi="123"+name;
		 os.writeObject(newpavi);
	 }private void readObject(ObjectInputStream is)throws Exception{
		System.out.println("Inside");
		 String str=(String)is.readObject();
		 name=str.substring(3);
	 }
 public static void main(String[] args){
	 Check_pubilc c=new Check_pubilc();
	 try{
	 System.out.println(c.name);
	 FileOutputStream fos=new FileOutputStream("abc.txt");
	 ObjectOutputStream oos=new ObjectOutputStream(fos);
	 oos.writeObject(c);
	 FileInputStream fis=new FileInputStream("abc.txt");
	 ObjectInputStream ois=new ObjectInputStream(fis);
	 Check_pubilc c1=(Check_pubilc)ois.readObject();
	 System.out.println(c1.name);
 }catch(Exception e){
	 e.printStackTrace();
 }
}}
