import java.io.*;

class P4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of Array");
        int x = Integer.parseInt(br.readLine());
        char arr[] = new char[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = br.readLine().charAt(0);
        
            }
        
        System.out.print("Vowels in array : ");
        for (int i = 0; i < x; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
