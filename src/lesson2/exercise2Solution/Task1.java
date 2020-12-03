package lesson2.exercise2Solution;

public class Task1 {

    public static void main(String[] args) {
        int n = 10288;
        int[] result = calculateDivisors(n);

        for (int elem:result){
            if (elem == 0){
                break;
            }
            System.out.println(elem);
        }
    }

    private static int[] calculateDivisors(int n) {
        int[] divisors = new int[n];
        int count = 0;
        for (int i=1; i<=n; i++){
            if (n%i == 0) {
                divisors[count] = i;
                count++;
            }
        }
        return divisors;
    }
}
