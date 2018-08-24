package lintcode;

import java.util.Stack;

public class ImplementQueuebyTwoStacks {

	public Stack<Integer> stack1;
	public Stack<Integer> stack2;
	public Stack<Integer> curStack;
	
	public void MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
    	if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
    	if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
