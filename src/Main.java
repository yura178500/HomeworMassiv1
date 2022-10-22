public class Main {
    public static void main(String[] args) {

        int[] amount = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] amount = new int[30];
        for (int i = 0; i < amount.length; i++) {
            amount[i] = random.nextInt(100_000) + 100_000;
        }
        int sumAmount, i;
        for (sumAmount = 0, i = amount.length - 1; 0 <= i; sumAmount += amount[i--]) ;
        System.out.println("Сумма трат за месяц составила   " + sumAmount);
        return amount;
    }
}
