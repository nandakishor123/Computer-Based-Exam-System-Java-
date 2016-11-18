import java.util.*;
import java.io.*;

class Login{
    int check(String username, String password) throws IOException, FileNotFoundException{
        String line = null;
        BufferedReader br = new BufferedReader(new FileReader("login.txt"));  
        while ((line=br.readLine())!=null) {
            String[] elements= line.split("-");
            if(username.equals(elements[0]) && password.equals(elements[1])){
                System.out.println("Logged In");
                System.out.println("Welcome " + elements[0]);
                if(elements[2].equals("Faculty")){
                    return 2;
                }     
                return 1;
            }
        }
        return 0;
    }
}
