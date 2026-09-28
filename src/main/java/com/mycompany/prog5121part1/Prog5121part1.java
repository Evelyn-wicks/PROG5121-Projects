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
            this.password=password;
            this.cellPhoneNumber= cellPhoneNumber;  
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
    Login Login =new Login("Eve_1","Ev&&ely@nn99!", +27834558976");
            
//registration validation
system.out.println(Login.registerUser());

//Login verification
system.out.println(login.returnLoginStatus("Eve_1",Ev&&ely@nn99!"."Evelyn.Wicks" );
  }                                          
                                           

    

      
        
    
    


             
             
