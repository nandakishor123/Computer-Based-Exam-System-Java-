import java.util	.*;
import java.io.*;

class Exam{
	void attempt(String username) throws IOException, FileNotFoundException{
		Rules r = new Rules();
		int totalmark=0;
		int markscored=0;
		Scanner s = new	Scanner(System.in);
		String ans;
		r.print();
		int count = 0;
		String line = null;
        BufferedReader br = new BufferedReader(new FileReader("questions.txt"));  
        while ((line=br.readLine())!=null) {
        	if(count%6==0){
        		System.out.println("Question : ");
        	}
        	System.out.println(line);
        	if(count%5==0 && count!=0){
        		System.out.println("Enter your choice : ");
        		ans = s.nextLine();
        		if(ans.equals(line)){
        			markscored+=4;
        		}
        		totalmark+=4;
        	}
        	count++;
        }
  		System.out.println("Totalmark : " + totalmark);
  		System.out.println("Markscored : " + markscored);
  		mark e = new mark();
  		e.store(totalmark, markscored, username);
	}
}