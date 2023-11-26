
import java.util.Random;

public class Main {

    //create a Random class variable to generate random values
    static Random random = new Random();

    private static void iteration() {
        //create a loop that will repeat 10 times
        System.out.println("num1:  num2:  gcd:");
        for (int i = 0; i < 10; i++) {
            //create 1 random variable with random
            int num1 = random.nextInt(100);
            //create 2 random variable with random
            int num2 = random.nextInt(100);
            //execute maxivisor method
            maxDivisor(num1, num2);
        }
    }

    //method finds the greatest common divisor
    private static void maxDivisor(int a, int b) {
        //if at least 1 number is less than 0, stop the method
        if (a < 0 || b < 0) {
            System.out.println("Only positive numbers!!!");
            return;
        }
        //create a variable(gcd) which is the largest index that divides the given numbers(a,b)
        int gcd = 1;
        //create a loop that will repeat (a or b) times
        for (int i = 1; i <= a && i <= b; i++) {
            //check if i(local variable) is a common divisor
            if (a % i == 0 && b % i == 0) {
                //assign gcd common divisor
                gcd = i;
            }
        }
        System.out.println( a + "     " + b + "     " + gcd );
    }

    public static void main(String[] args) {
        iteration();
    }
}//void main calls the iteration method, it calls System.out.println("num1: num2: gcd:"); and then executes the maxDivisor method in a loop
