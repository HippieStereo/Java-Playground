package serializable.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppRun {

	public static void main(String[] args) {

		ImplSerializable implSerializable = new ImplSerializable("String", "transient String");
		
		String fileName = "test-serialize.srz";
		
		// Print after serialize
		
		System.out.println("ImplSerializable before serialize\n");
		System.out.println(implSerializable.toString());
		
		// Serialization
		
        try { 
  
            // Saving of object in a file 
            FileOutputStream file = new FileOutputStream(fileName); 
            ObjectOutputStream out = new ObjectOutputStream (file); 
  
            // Method for serialization of object 
            out.writeObject(implSerializable); 
  
            out.close(); 
            file.close(); 
  
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        implSerializable = null; 
  
        // Deserialization
        
        try { 
  
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(fileName); 
            ObjectInputStream in = new ObjectInputStream (file); 
  
            // Method for deserialization of object 
            implSerializable = (ImplSerializable)in.readObject(); 
  
            in.close(); 
            file.close(); 
  
            // System.out.println("z = " + object1.z); 
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
		
		// Print after deserialize
		
		System.out.println("ImplSerializable after serialize\n");
		System.out.println(implSerializable.toString());
		
	}

}
