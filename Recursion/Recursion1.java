public class Recursion1 {

    public static void printnumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnumbers(n - 1);

    }

    public static void main(String[] args) {
        int i = 5;
        printnumbers(i);
    }
}
