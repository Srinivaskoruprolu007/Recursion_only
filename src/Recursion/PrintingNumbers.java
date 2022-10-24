package Recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        forwardPrint(start,end);
        System.out.println("______________________________________");
        reversePrint(start,end);

    }
    public static void forwardPrint(int start,int end ){
        if(start > end){
            return;
        }
        System.out.println(start);
        forwardPrint(start+1,end);
    }
    public static void reversePrint(int start, int end){
        if(end < start){
            return;
        }
        System.out.println(end);
        reversePrint(start,end-1);
    }
}
