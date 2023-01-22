package patientpackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class pationts {

	public static void main(String[] args) {
		
		boolean i = true;
		
		
			
			
	    Scanner sr = new Scanner(System.in);
	    PationDetails ser = new PationDetails();
	    while(i)
		{
	    	System.out.println("select number 1 to do serlization ");
			System.out.println("select number 2 to de De-serlization");
			int select = sr.nextInt();
			if (select == 1)
			{
	    System.out.print("Enter the pation name ");
	    ser.pationName=sr.next();
	    System.out.print("Enter the pation age ");
	    ser.pationAge=sr.nextInt();
	    System.out.print("Enter the pation ID ");
	    ser.pationID=sr.nextInt();
	    
	    
	    try{
	    	
	        FileOutputStream file = new FileOutputStream("serlization4.txt");
	        ObjectOutputStream out = new ObjectOutputStream(file);
	        out.writeObject(ser);
	        out.close();
	        file.close();
	        System.out.println("===============serialized and saved==================");
	         }catch (Exception ex){
	      ex.printStackTrace();
	    }
	    
		       }
		
	    else if(select == 2)
	    {
	    	try
		    {
		        // Reading the object from a file
		        FileInputStream file = new FileInputStream("serlization4.txt");
		        ObjectInputStream in = new ObjectInputStream(file);
		        // Method for deserialization of object
		        PationDetails object1 = (PationDetails) in.readObject();
		        in.close();
		        file.close();
		        System.out.println("Object has been deserialized ");
		        System.out.println("pation Name : " + object1.pationName);
		        System.out.println("pation age is : " + object1.pationAge);
		        System.out.println("partion  ID :  " + object1.pationID);
		    }
		    catch(IOException ex)
		    {
		        System.out.println("IOException is caught");
		    }
		    catch(ClassNotFoundException ex)
		    {
		        System.out.println("ClassNotFoundException is caught");
		    }
	    }

		 
		}
	}

}
