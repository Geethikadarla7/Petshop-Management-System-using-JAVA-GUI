package PROJECT;
import java.util.Scanner;

public class MaximumNumbersQuery {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int Q = scanner.nextInt();

	        int[] numbers = new int[N];
	        for (int i = 0; i < N; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int[] queries = new int[Q];
	        for (int i = 0; i < Q; i++) {
	            queries[i] = scanner.nextInt();
	        }

	        int[] maxNumbers = computeMaxNumbers(numbers);

	        for (int i = 0; i < Q; i++) {
	            int query = queries[i];
	            System.out.println(maxNumbers[query]);
	        }
	    }

	    private static int[] computeMaxNumbers(int[] numbers) {
	        int n = numbers.length;
	        int[] maxNumbers = new int[n + 1];

	        for (int i = 1; i <= n; i++) {
	            maxNumbers[i] = Math.max(maxNumbers[i - 1], numbers[i - 1]);
	        }

	        return maxNumbers;
	    }
	}



