package jackson.nazhir.SumOfNums;

import java.util.Scanner;

/**
 * Created by nazhirjackson on 9/9/16.
 */
public class SumOfNumbers {

    public int askForNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int num = scan.nextInt();
        int temp = 0;
        for(int i=1; i <= num; i++){
            temp += i;
        }
    return temp;
    }
    public static void main(String[] args) {
        SumOfNumbers n = new SumOfNumbers();
        int total = n.askForNum();
        System.out.println("The sum Of Numbers is: " + total);


    }
}
