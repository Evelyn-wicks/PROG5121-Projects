/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121part1;
import javax.swing.JOptionPane;
/**
 *
 * @author evely
 */
public class Prog5121part1 {            
    public class Login{
        private String username;
        private String password;
        private String cellPhoneNumber;
        //constructor
        
        public Login(String username,String password, String cellPhoneNumber){ 
          this.username= username;
            this.password = password;
            this.cellPhoneNumber = cellPhoneNumber;  
        }
             //usernsme check
        public boolean checkUserName(){
            return username.contains("-") && username.length()<=5;
        }
        //password complexity check
        public boolean checkPasswordComplexity(){
            boolean Length = password.length() >=8;
            boolean capital= password.matches(".*[A-Z].*");
            boolean number = password.matches(".*[0-9].*");
            boolean special= password.matches(u".*[!@#$%^&*(),.?\":{}|<>].*"surrname);
            return Length && capital &&number && special;
        }
        //cellphone check (+27 and 10 digits following)
        public boolean checkCellPhoneNumber(){
         return cellPhoneNumber.matches("^\\+27\\d{9}$");
        }
        //Registration text messaging
        public String registerUser(){
            if (!checkUsername()){
                return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length";
            }
            if (!checkPasswordComplexity()){
                return "Username is not rightly formatted; please make sure that password contains at least six characters, a capital letter, a number, and a special character.";
            }
            if (!checkCellPhoneNumber()){
                return "Cellphone number is incorrectlt formatted or does not have an international code; please correct the number and try again.";
            }
            return "User registered successfully!";
        }
        //Login verification
        public boolean loginUser(String inputUsername,String inputPassword){
            return this.username.equals(inputUsername) && this.password.equals(inputPassword);
        }
        // login status messaging
        public String returnLoginStatus(String inputUsername, String inputPassword, String firstname, String lastname){
            if (loginUser(inputUsername, inputPassword)){
                return "Welcome" + firstname +"" + lastname + ",it is great to see you again.";
            }else{
                return "Username or password incorrect, please try again.";
            }
        }
    }
   piblic static void main(String[] args){
    //create a testing user
    Login login =new Login("Eve_1","Ev&&ely@nn99!", +27834558976");
            
//registration validation
system.out.println(login.registerUser());

//Login verification
system.out.println(login.returnLoginStatus("Eve_1",Ev&&ely@nn99!"."Evelyn",Wicks"));
      
        }
package com.mycompany.prog5121part2;
//java login

public class Login 
    private String username;
    private String password;
    private String cellPhoneNumber;
    
public Login(String username, String password, String cellPhoneNumber)
   this.username = username, String password, String cellPhoneNumber){
   this.password = username;
   this.cellPhoneNumber = cellPhoneNumber;
   }
   public boolean checkUserName() {
       return username.contains("_")and username. length() <= 5;
   }
   public boolean checkPasswordComplexity() {
       return password.matches(".*[A-Z].*")&&
              password.matches(".*[a-z].*")&&    
              password.matches(".*\\d.*")&&
              password.matches(".*[!@#$%^&*].*")&&
              password.length()()>=8;
   }
   public booloean checkCellPhoneNumber() {
       return cellPhoneNumber.matches("\\+27\\d{9}$");
   }
   
public String registerUser() {    
 if (checkUserName() && checkPasswordComplexity() && checkCellPhoneNumber())}
  return "User registered successfully!";
} else {
return "Registrationfailed. Please make sure your details are correct.";
 }
}
public boolean loginUser(String enteredUsername, String enteredPassword){
    return this.username.equals(enteredusername) && this,password.equals(enteredPassword);
}
public String returnLoginStatus(String enteredUsername, String enteredPassword, String firstname, String lastName){
    if(loginUser(enteredUsername, enteredPassword)){
        return "Welcome"+ firstname + "" + lastname + ",it is great to her from you again! long time no see.";
    } else {
      return "Username or password invalid, please try again."; 
    }
}

//MESSAGE JAVA
public class Message {
    private String sender;
    private String receiver;
    private String messageText;
    
public Message(String sender, String receiver, String messageText){     
 this.sender = sender;
 this.receiver = receiver;
 this.messageText = messageText;
}

public String sendMessage(){
    return "Message sent from" + sender + "to" + receiver;
}
public String viewMessage(){
    return "Message sent from" + messageText;
}
}

//runner
public class Prog5121part2 {
    public static void main(String[] aargs){
    Login login = new Login("Mba_1"," Ev$$sec@Mba33!", "+27845568978");
    System.out.println(login.registerUser());
    if(login.loginUser("Mba_1","Ev$$sec@Mba33!")){
        Mrssage msg = nes Message("Mbali", "wicks" Hey, welcome to part 2!);
        System.out.println(msg,sendMessage());
        System.out.println?(msg.viewMessage());
    } else {
        System.out.println(Login failed. Messaging not allowed);
    }
    }
    ]
      
        
    
    


             
             
