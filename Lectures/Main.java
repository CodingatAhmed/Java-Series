import java.util.Scanner;

//import java.lang.*;
public class Main {
    public static void main(String[] args) {


        // 0 1 1 2 3 5 8

        int x;
        int y;
        int result;
        int temp;
        int count;
        int num;

        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter number till you want to generate fibonacci");
        num = userinput.nextInt();

        x = 0;
        y = 1;
        count = 0;
        result = 0;
        while (count < num){
            result = x + y;
            temp = y;
            y = result ;
            x = temp;
            count = count + 1;
        }

        System.out.println("The "+num+"th"+" of fibonacci is: "+result);
    }
}