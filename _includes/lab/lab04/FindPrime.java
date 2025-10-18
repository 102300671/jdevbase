public class FindPrime {
	public static void main(String[] args) {

		  int arr[]= {3,5,7,8,10,12,35,37,4583,8457};

		  findPrime(arr);

		}
	public static void findPrime(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
		      boolean isprime = true;
		      for(int j = 2; j <= Math.sqrt(arr[i]); j++) {
		        if(arr[i] % j == 0) {
		          isprime = false;
		          break;
		        }
		      }
		      if(isprime) {
		        System.out.println(arr[i]);
		      }
		    }
	}
}