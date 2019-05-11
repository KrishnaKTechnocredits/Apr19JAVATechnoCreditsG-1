package swapanaW;

public class PrimeNos {

	void isPrime(int number) 
	{
		boolean flag = true;
		// System.out.println(number);
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0) 
			{
				flag = false;
				System.out.println(number + " not Prime");
				break;
			}
		}

		if (flag == true)
		{
			System.out.println(number + " is Prime");
		}
	}

	public static void main(String[] args) {

		PrimeNos primenos = new PrimeNos();
		primenos.isPrime(23);
	}

} 