import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number : ");
        int A = sc.nextInt();

        System.out.print("Second Number : ");
        int B = sc.nextInt();

        System.out.println("Enter an Operator , Do you want to Calculate : (+,-,*,/,%) : ");

        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+' : System.out.println(A+B);
                break;

            case '-' : System.out.println(A-B);
                break;

            case '*' : System.out.println(A*B);
                break;

            case '/': if (B == 0) {
                System.out.println("Error : Not divede by 0");
            }
            else{
                System.out.println(A/B);
            }
                break;

            case '%' : if (B ==0) {
                System.out.println("Error ! Here it's not modularity by 0");
            }else{
                System.out.println(A%B);
            }
                break;
                
            default: System.out.println("Invaild Operator");
                break;
        }
        
    }
}
