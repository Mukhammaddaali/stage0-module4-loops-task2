package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i=0;
        while (i<=printTillInclusive){
            System.out.println(i);i+=2;
        }
    }
    public void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printEvenNumbers(x);
    }
}
