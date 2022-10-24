package Recursion.Basic;

public class Main {
    public static void main(String[] args) {
        print();// here we're calling the function
        printRecursively(1);

    }
    // Pre-Requisites are methods and Memory management
    // Write a function that takes in a number and prints it
    static void printNum1(){
        System.out.println(1);
    }
    static void printNum2(){
        System.out.println(2);
    }
    static void printNum3(){
        System.out.println(3);
    }
    static void printNum4(){
        System.out.println(4);
    }
    static void printNum5(){
        System.out.println(5);
    }
    static void print(){

        printNum1();
        printNum2();
        printNum3();
        printNum4();
        printNum5();
    }
//    What is Recursion ?
//    Calling a function from itself only

//    The calling of function in java works like stack
//    Let's do the above program using recursion
    static void printRecursively(int num){
        if(num > 5){
            return;
        }
        System.out.println(num);
        printRecursively(num+1);
    }
}
// Recursion should contain a base condition which is used to tell when to stop