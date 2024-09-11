public class Reduce {
    public static void main(String[] args) {

        int sum = 0;
        int n=100;
        while (n > 0) {

            // Find out which numbers divide i.
            boolean divisibleBy2 = n % 2 == 0;

            // Print our appropriate result.
            if (divisibleBy2) {

                sum += 1;
                n = n / 2;

            } else {

                sum += 1;
                n = n - 1;

            }
        } System.out.println(sum);
    }
}


