package com.company;
import java.util.Stack;

public class Question3 {

    public static boolean find(int target, Stack<Integer> s) {
        Stack<Integer> stack1 = new Stack<>();
        boolean var = false;
        while (!s.empty()) {
            //pop out first element in the stack
            int top = s.pop();
            //push into new stack
            stack1.push(top);
            //check if the element is target
            if (target == top){
                var = true;
                break;
        }
    }
        while (!stack1.empty()){
            int first = stack1.pop();
            s.push(first);
        }
        return var;

}

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> newStack = new Stack<>();
        int [] arr = {1, 2, 3, 4};
        for(int i=0; i<= arr.length-1; i++){
            newStack.push(arr[i]);
        }
        System.out.println(find(7,newStack));
    }
}
