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

   static void display() throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入账号");
      userName=scanner.nextLine();
      System.out.println("请输入密码");
      userPassword=scanner.nextLine();
      validate();
   }

   static void validate() throws Exception {
      if (D.findUser(userName,userPassword)){
         System.out.println("成功登录");
      }else {
         System.out.println("登陆失败，请重试！");
         display();
      }

   }

}
