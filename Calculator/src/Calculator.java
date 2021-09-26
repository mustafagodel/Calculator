import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number");
        double a=input.nextInt();
        System.out.println("Enter Second Number");
        double b=input.nextInt();
        String transactions="1-Addition\n"+
                            "2-Extraction Process\n"+
                            "3-Multiplication\n"+
                            "4-Division";
        System.out.println(transactions);
        System.out.println("Please Select Transaction");
        int e=input.nextInt();
       double conclusion=0;

        switch (e){

            case 1:
               conclusion=a+b;
                System.out.println(conclusion);
                break;
            case 2:
                conclusion=a-b;
                System.out.println(conclusion);
                break;
            case 3:
                conclusion=a*b;
                System.out.println(conclusion);
                break;
            case 4:
                conclusion=a/b;
                System.out.println(conclusion);
                break;
            default:
                System.out.println("Wrong Choice");
        }

    }
}
