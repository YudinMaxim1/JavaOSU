//Задание № 7

import java.util.*;

public class SwapStacks {
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1); stack1.push(2); stack1.push(3);
        stack2.push(3); stack2.push(4); stack2.push(5);

        System.out.println("Before swapping: ");
        System.out.println(stack1);
        System.out.println(stack2);

        Stack<Integer> temp = new Stack<>();
        while(!stack1.isEmpty()){
            temp.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        while(!temp.isEmpty()){
            stack2.push(temp.pop());
        }

        System.out.println("After swapping: ");
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
