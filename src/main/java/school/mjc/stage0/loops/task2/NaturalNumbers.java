package school.mjc.stage0.loops.task2;

import java.util.Scanner;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int i=0;
        while (i<=lastPrinted){
            System.out.println(i++);
        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        naturalNumbersPrinter(x);
    }
}
