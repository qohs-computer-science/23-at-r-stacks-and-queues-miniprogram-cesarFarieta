import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
	Stack <Integer> myStack = new Stack <Integer> ();
    Scanner myObj = new Scanner(System.in);

    System.out.print("Please enter a whole number: ");
    int wholeNum = myObj.nextInt();
    myStack.push(wholeNum);

    System.out.print("Please enter a whole number: ");
    wholeNum = myObj.nextInt();
    myStack.push(wholeNum);

    System.out.print("Please enter a whole number: ");
    wholeNum = myObj.nextInt();
    myStack.push(wholeNum);

    System.out.print("Please enter a whole number: ");
    wholeNum = myObj.nextInt();
    myStack.push(wholeNum);

    System.out.print("Please enter a whole number: ");
    wholeNum = myObj.nextInt();
    myStack.push(wholeNum);

	Stack <Integer> doubleStack = new Stack <Integer> ();
    System.out.println(myStack);


    while (!myStack.isEmpty()){
        doubleStack.push(myStack.pop());
    }
    while(!doubleStack.isEmpty()){
        int pop= doubleStack.pop();
        myStack.push(pop);
        myStack.push(pop);
    }

    System.out.println(myStack);
  } // end main
} // end class
