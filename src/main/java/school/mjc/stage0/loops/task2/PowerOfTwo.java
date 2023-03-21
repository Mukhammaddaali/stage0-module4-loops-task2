package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0) System.out.println("too much power");
        else {
            int i=0,k=1;
            while (i<power){
                k*=2;
                System.out.println(k);i++;
            }
        }

    }
}
