package Login;

import java.util.Scanner;

public class LoginForm {
   private static UserDAO D;

   private static String userName;
   private static String userPassword;

   private static UserDAO dao(){
      return new UserDAO();
   }

   static void init(){
     D= dao();
     userName=null;
     userPassword=null;
   }

   static void display(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入账号");
      userName=scanner.nextLine();
      System.out.println("请输入密码");
      userPassword=scanner.nextLine();
   }

   static void validate(){

   }

}
