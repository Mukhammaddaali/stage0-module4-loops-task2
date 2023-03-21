package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int  i=0;
        while (i<=printToInclusive){
            System.out.println(i++);
        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printPrimeNumbers(x);
    }
}
