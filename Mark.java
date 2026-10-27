import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = a.nextInt();

        int[] mark = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter mark:");
            mark[i] = a.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(mark[i]);
        }

        a.close();
    }
}
