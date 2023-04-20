
import java.util.Scanner;

class P3 {
    public static void main(String[] psj) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        int multi=1;

        for (int i = 0; i < x; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();

            if (i % 2 != 0) {
                multi=multi*arr[i];
            }
    
        }
        System.out.println();
        System.out.println("Product of odd index elements = "+multi);

    }
}

