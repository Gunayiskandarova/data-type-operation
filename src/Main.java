//public class Main {
//    public static void main(String[] args) {
//
//        int number1 = 15;
//        int number2 = 7;
//
//        int sum = number1 + number2;
//        System.out.println (sum);
//        int sub = number1-number2;
//        System.out.println (sub);
//        int multi = number1 * number2;
//        System.out.println(multi);
//        int per = number1 % number2;
//        System.out.println(per);
//        int div = number1/number2;
//        System.out.println(div);
//
//    }
//}


//import java.util.Scanner;
//
//public class NumberApp {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Number is:");

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "even" : "old");

        scanner.close();
    }
}


