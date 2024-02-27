public class Main {
    public static void main(String[] args) {
        int x = 524, sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += x % 10;
            x = x / 10;
        }
        System.out.print(sum);

    }
}