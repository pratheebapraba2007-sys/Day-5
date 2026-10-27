public class Main {
    public static void main(String[] args) {
        int a[] = {10, 25, 5, 40, 15};

        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                second = small;
                small = a[i];
            } else if (a[i] < second && a[i] != small) {
                second = a[i];
            }
        }

        System.out.println("Second smallest: " + second);
    }
}
