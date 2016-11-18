import java.util.*;
import java.io.*;

class User{
	void insert(String username, String password) throws IOException, FileNotFoundException{	
		try{
			PrintWriter br = new PrintWriter(new FileWriter("login.txt", true));
			br.println(username+"-"+password+"-"+"student");
			br.close();
		}
		catch(Exception e){
            System.out.println("Error");
		}
    }
}