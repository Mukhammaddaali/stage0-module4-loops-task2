package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int k=1,i=0;
        while (i<printToInclusive){
            i++;
            k*=i;
        }

    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printFactorialRow(x);
    }
}
