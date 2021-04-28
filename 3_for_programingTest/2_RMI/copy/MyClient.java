import java.rmi.*;
import java.util.Scanner;

public class MyClient {

    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n1, n2 = 0;
            int result1, result2 = 0 ;

            // add
            Adder addstub = (Adder) Naming.lookup("rmi://localhost/add"); 
            System.out.println("Using the Adder Server...");
            System.out.print("an integer input 1 for addition: ");
            n1 = scanner.nextInt();
            System.out.print("an integer input 2 for addition: ");
            n2 = scanner.nextInt();

            // 입력받은 두 정수에 대한 덧셈 결과 
            result1 = addstub.add(n1,n2);
            System.out.println("from Adder Server :"+result1);


            Multi multistub = (Multi) Naming.lookup("rmi://localhost/multi"); 
            System.out.println("Using the Multiplier Server...");
            System.out.print("an integer input 1 for Multiplication: ");
            n1 = scanner.nextInt();
            System.out.print("an integer input 2 for Multiplication: ");
            n2 = scanner.nextInt();

            // 입력받은 두 정수에 대한 곱셈 결과 
            result2 = multistub.multi(n1,n2);
            System.out.println("from Multiplier Server :"+result2);

            // 두 서버의 연산 결과의 합 
            System.out.println("Add Two Server Results: "+(result1+result2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
