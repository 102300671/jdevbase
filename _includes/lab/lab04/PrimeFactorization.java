import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[20];
		int i = 0;
		if(isPrime(n)) {
			System.out.print(n + "=" + n);
			System.out.println(n);
		}
		else {
			int count = fac(n, arr);
			System.out.print(n + "=");
			for(i = 0; i < count - 1 ; i++) {
				System.out.print(arr[i] + "x");
			}
			System.out.println(arr[i]);
		}
		sc.close();
	}
	public static boolean isPrime(int num) {
        if (num <= 1 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        if(num == 2) {
          return true;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static int fac(int num, int[] arr) {
		int j = 0;
		while(num % 2 == 0) {
			arr[j++] = 2;
			num /= 2;
		}
		for(int i = 3; i <= Math.sqrt(num); i+=2) {
			while(num % i == 0) {
				arr[j++] = i;
				num /= i;
			}
		}
		if(num > 2) {
			arr[j++] = num;
		}
		return j;
	}
}