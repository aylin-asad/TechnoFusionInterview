
public class PrimeNumbersSum {
	
    static boolean isPrime(int n)
    {
        if(n == 1) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 0; i <= 1000; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
