import java.util.*;
public class FibonacciSeriesQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);

        for(int i=1; i<n; i++){
            int c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
         sc.close();
    }
}
