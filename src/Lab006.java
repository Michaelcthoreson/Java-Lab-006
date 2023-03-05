/**
 * @author Michael Thoreson
 * @version 1.0
 * @since 1.0
 */

import java.util.Scanner;
public class Lab006 {
    int n;
    int m;

    /**
     * @param nParam numerator
     * @param mParam denominator
     */
    public Lab006(int nParam, int mParam){
        n = nParam;
        m = mParam;
    }
    /**
     * this method checks if the value n inside of a Lab006 object is divisible by the corresponding m value.
     */
    public boolean isDivisible(){
        if(this.n % this.m == 0){return true;} else {return false;}
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What two numbers do you want to check?");
        int nInput = input.nextInt();
        int mInput = input.nextInt();
        Lab006 checker = new Lab006(nInput, mInput);
            System.out.printf("%d is ", checker.n);
            if (checker.isDivisible() == false){
                System.out.printf("NOT ");
            }
            System.out.printf("divisible by %d.%n", checker.m);

    }
}
