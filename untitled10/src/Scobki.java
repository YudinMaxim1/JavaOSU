//Задание № 5

import java.util.*;

public class Scobki {

    public static boolean check(String str){
        Stack<Character> stack = new Stack<>();

        for(char c:str.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        if(check(str)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
