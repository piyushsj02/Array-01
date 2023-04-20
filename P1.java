
import java.util.Scanner;

class P1 {
    public static void main(String[] psj) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        int sum=0;

        for (int i = 0; i < x; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();

            if (arr[i] % 2 != 0) {
                sum=sum+arr[i];
            }
    
        }
        System.out.println();
        System.out.println("sum of odd elements = "+sum);

    }
}
