public class Main {
    public static void main(String[] args) {
        int a[] = {10, 25, 5, 40, 15};

        int large = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }
        }

        System.out.println("Largest number: " + large);
    }
}
