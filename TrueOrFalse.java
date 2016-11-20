import java.util.*;
import java.io.*;
public class TrueOrFalse{
  public static void main(String[] args)throws IOException , FileNotFoundException {
  String q;
  String a;
  String b;
  String ans;
  int i,n;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the number of questions");
  n = s.nextInt();
  PrintWriter pw = new PrintWriter(new FileWriter("questions_ToF.txt",true));

try {
  for(i=0;i<n;i++) {
    System.out.println("Enter question" + (i+1));
    q = s.nextLine();
    System.out.println("Enter the option 1");
    a = s.nextLine();
    if(a.equals("True")||a.equals("False")) {
      pw.println(a);
    }
    System.out.println("Enter the option 2");
    b = s.nextLine();
    if(b.equals("True")||b.equals("False")) {
    pw.println(b);
  }
    System.out.println("Enter the answer");
    ans = s.nextLine();
    if(ans.equals("True")||ans.equals("False")) {
      pw.println(ans);
    }
  }
} catch(Exception e) {
    System.out.println("Error!");
   }
 }
}
