import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int z = 0; 
        for (int i = 1; i < size; i++) {
            if (arr[z] != arr[i]) { 
                z++;
                arr[z] = arr[i];
            }
        }

        // Print only unique elements
        for (int i = 0; i <= z; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
