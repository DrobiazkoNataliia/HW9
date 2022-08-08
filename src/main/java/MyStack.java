import java.util.*;

public class MyStack {

    public static void main(String[] args) {
        Stack<String> fibonacciNumbers = new Stack<>();
        fibonacciNumbers.push("One");
        fibonacciNumbers.push("Two");
        fibonacciNumbers.push("Tree");
        fibonacciNumbers.push("Five");
        fibonacciNumbers.push("Eight");
        fibonacciNumbers.push("Thirteen");
        fibonacciNumbers.push("Twenty one");

        System.out.println(fibonacciNumbers.size());

        fibonacciNumbers.remove(1);

        System.out.println(fibonacciNumbers);

        System.out.println(fibonacciNumbers.peek());

        fibonacciNumbers.pop();
        fibonacciNumbers.pop();
        fibonacciNumbers.pop();
        fibonacciNumbers.pop();
        fibonacciNumbers.pop();

        System.out.println("The stack is empty? " + fibonacciNumbers.isEmpty());

        fibonacciNumbers.clear();
    }
}

