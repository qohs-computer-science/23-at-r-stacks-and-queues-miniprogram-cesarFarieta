// Cesar Farieta, period 3, 12,10,2024
// This program does two main things one with stacks and the other with queues. With stacks we asked the user for 5 vaulues 
//and then we stored those in a stack to then print out the stack. Then we printed out a stack that has the original stack but
// buplicated each value while still staying in order. With queues we asked the user for 10 vaulues and then we stored those in a 
//queue to then print out the queue. Then we printed out a queue that has the same values as the original queue but this time sorted
//from least to greatest but having all the even numbers in the front.


import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {// start class
  public static void main(String[] args) {//start main
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
    System.out.println("Original Stack: "+ myStack);


    while (!myStack.isEmpty()){// start while
        doubleStack.push(myStack.pop());
    }// end while
    while(!doubleStack.isEmpty()){// start while
        int pop= doubleStack.pop();
        myStack.push(pop);
        myStack.push(pop);
    }// end while

    System.out.println("Double number stack: "+myStack);

    // part 2

    Queue<Integer> numberQueue= new LinkedList<>();

    System.out.print("Please enter a whole number: ");
    int wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);
    System.out.print("Please enter a whole number: ");
    wholeNumber = myObj.nextInt();
    numberQueue.add(wholeNumber);

    System.out.println("Original Number Queue: "+numberQueue);

    Queue<Integer> oddQueue= new LinkedList<>();
    Queue<Integer> evenQueue= new LinkedList<>();

    while(!numberQueue.isEmpty()){// start while
      if(numberQueue.peek()%2==0)
        evenQueue.add(numberQueue.remove());
      else 
        oddQueue.add(numberQueue.remove());
    }// end while


    while(!oddQueue.isEmpty()){// start while
      evenQueue.add(oddQueue.remove());
    }// end while
    while(!evenQueue.isEmpty()){// start while
      numberQueue.add(evenQueue.remove());
    }// end while


    System.out.println("Final, sorted Queue: "+numberQueue);

  } // end main
} // end class
