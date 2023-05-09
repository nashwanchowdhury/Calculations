import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int first = scanner.nextInt();
    System.out.println("Enter a number:");
    int second = scanner.nextInt();
    int sum = first + second;
    int sub = first - second;
    int multiply = first * second;
    int division = first / second;
    int modulus = first % second;
    System.out.println(first + " + " + second + " = " + sum);
    System.out.println(first + " - " + second + " = " + sub);
    System.out.println(first + " * " + second + " = " + multiply);
    System.out.println(first + " / " + second + " = " + division);
    System.out.println(first + " % " + second + " = " + modulus);
        }
    }
