package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i=multiplyByAndToInclusive;
        while (i==0){
            System.out.println(multiplyByAndToInclusive*i);
            if (i>0)i--;    else i++;
        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printMultiplied(x);
    }
}
