import java.util.*;
public class Array5 {
    //Transpose of a matrix...!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        System.out.print("Enter the value of matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    
    }
}
