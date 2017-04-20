
public class fiboSwift
{
	static int N = 30;
	
	public static void printFibo(int x)
	{
		if(isPrime(x))
			System.out.print("BuzzFizz ");
		else if(x%15==0)
			System.out.print("FizzBuzz ");
		else if(x%5==0)
			System.out.print("Fizz ");
		else if(x%3==0)
			System.out.print("Buzz ");
		else
			System.out.print(x+" ");
	}
	
	private static boolean isPrime(int x) {
		if (x <= 1)  return false;
	    if (x <= 3)  return true;
		for(int i=1;i<=Math.sqrt(x);i++){
			if (x%i == 0)
				return false;
		}
		
		// TODO Auto-generated method stub
		return true;
	}

	public static void Fibo(int N)
	{
		if(N==0)
			return;
		if(N==1){
			System.out.print("1 ");
			return;
		}
		if (N==2){
			System.out.print("1 1 ");
			return;
		}
		
		int FArr[]= new int[N];
		FArr[0] = 1;
		FArr[1] = 1;
		
		FArr[0] = 1;
		FArr[1] = 1;
		System.out.print("1 1 ");
		
		for(int i=2;i<N;i++){
			FArr[i] = FArr[i-1] + FArr[i-2];
			printFibo(FArr[i]);
		}
	
	}
	
	public static void main(String []args)
	{
		Fibo(N);	
	}
}