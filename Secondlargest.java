public class Main {
    public static void main(String[] args) {
        int a[] = {10, 25, 5, 40, 15};

        int large = a[0];
        int second = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                second = large;
                large = a[i];
            } else if (a[i] > second && a[i] < large) {
                second = a[i];
            }
        }

        System.out.println("Second largest: " + second);
    }
}
