import java.util.*;
import java.io.*;

public class Questions {

  public void insert() throws IOException , FileNotFoundException{
    int n = 0;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int i;
    String answer;
    Scanner s = new Scanner(System.in);
    System.out.println("Number of questions");
    n = s.nextInt();
    try {
      PrintWriter pw = new PrintWriter(new FileWriter("questions.txt",true));
      for(i=0;i<n;i++) {
        System.out.println("Enter question");
        question = s.nextLine();
        question = s.nextLine();    
        pw.println(question);
        System.out.println("Enter option1");
        option1 = s.nextLine();
        pw.println(option1);
        System.out.println("Enter option2");
        option2 = s.nextLine();
        pw.println(option2);
        System.out.println("Enter option3");
        option3 = s.nextLine();
        pw.println(option3);
        System.out.println("Enter option4");
        option4 = s.nextLine();
        pw.println(option4);
        System.out.println("Enter the answer");
        answer = s.nextLine();
        pw.println(answer);
        pw.close();
      }
    } 
    catch(Exception e) {
      System.out.println("Error!");
    }
  }
}
