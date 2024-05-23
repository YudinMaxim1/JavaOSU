//Задание на обработку исключений

import java.util.*;

public class Registration {

    static class WrongLoginException extends Exception{
        public WrongLoginException(){
            super("Login doesn't have the requirements");
        }

        public WrongLoginException(String message){
            super(message);
        }
    }

    static class WrongPasswordException extends Exception{
        public WrongPasswordException(){
            super("Password doesn't have the requirements");
        }

        public WrongPasswordException(String message){
            super(message);
        }
    }


    public static boolean validUser(String login, String password, String confPassword){
        try{
            if(!login.matches("[a-zA-Z0-9]+") || login.length() >= 20){
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        try{
            if(!password.matches("[a-zA-Z0-9]+") || password.length() >= 20 || !password.equals(confPassword)){
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        return true;
    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input a Login: ");
        String login = input.nextLine();
        System.out.println("Input a Password: ");
        String password = input.nextLine();
        System.out.println("Confirm Password: ");
        String confPassword = input.nextLine();

        if(validUser(login, password, confPassword)){
            System.out.println("Registration succsesful");
        }else{
            System.out.println("Registration failed");
        }
    }
}
