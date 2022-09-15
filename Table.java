public class Table {

	public static void main(String[] args) {
		
		System.out.println("N\t 10*N\t 10*N\t 1000*N");
		for(int N = 1; N <= 5; N++)//loop to print out the list above
		{
			for(int y = 0; y < 4; y++)//loop that will print the numbers
			{
				System.out.print(N* (int)(Math.pow(10, y))+"\t ");
			}
		
			System.out.println();
		}

	}

}
