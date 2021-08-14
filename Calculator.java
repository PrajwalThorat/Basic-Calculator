import java.util.Scanner;
public class Calculator{

    public static Scanner scanner = new Scanner(System.in);
    public static int num1;
    public static int num2;
    public static char ans;

    public static void  Input(){
        System.out.print("Enter the First Number : ");
        num1 = scanner.nextInt();
        System.out.print("Enter the seconud Number : ");
        num2 = scanner.nextInt();
    }

    public static int Addition(int a, int b){
        int res = a+b;
        System.out.println("The Ans is : "+res);
        return res;
    }
    public static int Subtraction(int a, int b){
        int res = a-b;
        System.out.println("The Ans is : "+(res);
        return res;
    }
    public static float Division(int a, int b){
        float res = a/b;
        System.out.println("The Ans is : "+res);
        return res;
    }
    public static int Multiplication(int a, int b){
        int res = a*b;
        System.out.println("The Ans is : "+res);
        return res;
    }



    public static void main(String[] args) {
        do{
            System.out.println("Welcome To Calculator");
            System.out.println("---Option---");
            System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
            System.out.print("Enter : ");
            int input = scanner.nextInt();
            switch(input){
                case 1: Input();
                        Addition(num1, num2);
                        break;
                case 2: Input();
                        Subtraction(num1, num2);
                        break;
                case 3: Input();
                        Division(num1, num2);
                        break;
                case 4: Input();
                        Multiplication(num1, num2);
                        break;
                default:System.out.println("Invalid Input !!!");
                        break;

            }System.out.print("Do you want calculate again (y/n) : ");
             ans = scanner.next().charAt(0);

        }while(ans == 'Y' || ans == 'y');
        System.out.println("Thank You !!");
    }
}