import java.util.*;
import java.io.*;

class mark{
	void store(int totalmark, int markscored, String username) throws IOException, FileNotFoundException{
		try{
			PrintWriter br = new PrintWriter(new FileWriter("mark.txt", true));
			br.println(totalmark+"-"+markscored+"-"+username);
			br.close();
		}
		catch(Exception e){
            System.out.println("Error");
		}
	}
	void view(String username) throws IOException, FileNotFoundException{
		String line = null;
        BufferedReader br = new BufferedReader(new FileReader("mark.txt"));  
        while ((line=br.readLine())!=null) {
            String[] elements= line.split("-");
            if(username.equals(elements[2])){
                System.out.println("Exam Report : ");
                System.out.println("Totalmark : " + elements[0]);
                System.out.println("markscored : " + elements[1]);
            }
        }
	}
}