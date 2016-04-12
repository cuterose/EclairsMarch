package week1;

public class primeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max= 100;
		System.out.println("Generate Prime numbers between 1 and" + max);
		for(int i= 1; i<max; i++)
		{
			boolean isPrimenumber = true;
			for(int j = 2; j<i; j++)
			{
				if(i % j ==0)
				{
					isPrimenumber = false;
					break;
				}
			}
			
			if (isPrimenumber)
			{
				System.out.println(i+"");
				
			}
			
		}

	}

}
