import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//import java.lang.*;
public class Main {

//    public static void takeInput(){
//        Scanner intInput = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int newInput = intInput.nextInt();
//        System.out.println(newInput);
//    }
    public static void main(String[] args) {
        try {
            FileWriter fileOpen = new FileWriter("enterData.txt");
            fileOpen.write("Hello");
            System.out.println("Hello");
//            Scanner takeInput = new Scanner(System.in);
//            System.out.println("Enter data you want to write in file");
//            String enterData = takeInput.nextLine();
//            while (enterData != ""){
//                fileOpen.write(enterData);
//                enterData = takeInput.nextLine();
            }
        catch (IOException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
//            throw new RuntimeException(e);
//            System.out.println(e);
        }
    }
}