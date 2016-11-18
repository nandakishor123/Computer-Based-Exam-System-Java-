import java.io.*;
import java.util.*;

public class OnlineExam{
    public static void main(String args[]) throws IOException{
        int choice, check;
        boolean flag;
        String user, pass;
        Scanner s = new Scanner(System.in);
        Login login=new Login();      
        String username;
        String password;
        System.out.println("Enter the username : ");
        username = s.nextLine();    
        System.out.println("Enter the password : ");
        password = s.nextLine();
        check = login.check(username,password);
        if(check == 0){
            flag = false;
        }
        else{
            flag = true;
        }
        if(!flag){
            System.out.println("Password or Username wrong.");
            System.exit(0);    
        }
        if(check == 2){
            System.out.println("Role : Faculty");
            System.out.println("Functions : ");
            System.out.println("1. Add User");
            System.out.println("2. Add Questions");
            System.out.println("Enter your Choice : ");
            choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the username : ");
                    user = s.nextLine();
                    user = s.nextLine();
                    System.out.println("Enter the password  : ");
                    pass =  s.nextLine();
                    User u = new User();
                    u.insert(user,pass);
                    break;
                case 2:
                    Questions q = new Questions();
                    q.insert();
                    break;
                default:
                    System.out.println("Enter a valid Choice!!");
                    break;
            }
        }
        else{
            System.out.println("Role : Student");
            System.out.println("Functions : ");
            System.out.println("1. Attend Exam");
            System.out.println("2. View Marks");
            System.out.println("Enter your Choice : ");
            choice = s.nextInt();
            switch(choice){
                case 1:
                    Exam e = new Exam();
                    e.attempt(username);
                    break;
                case 2:
                    mark m = new mark();
                    m.view(username);
                    break;
                default:
                    System.out.println("Enter a valid Choice!!");
                    break;
            }   
        }              
    }
}


