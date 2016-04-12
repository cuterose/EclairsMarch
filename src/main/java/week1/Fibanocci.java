package week1;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 0, b = 0, c = 1;
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= 100; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }

	}

}
