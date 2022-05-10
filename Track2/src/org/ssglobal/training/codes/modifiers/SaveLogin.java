package org.ssglobal.training.codes.modifiers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveLogin {
	
	public static void main (String[] args) {
		
		Login login1 = new Login();
		login1.username = "ellirophile0319";
		login1.password = "admin0319";
		
		//Serialization
		try {
			FileOutputStream fos =  new FileOutputStream("./src/files/login.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(login1);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
	}

}
