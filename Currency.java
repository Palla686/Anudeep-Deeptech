class Currency 
{
    static int count(int coins[], int n, int sum)
    {        
    	// If sum is 0 then there is 1 solution

        if (sum == 0)
            return 1;
                            // If sum is less than 0 then no

        if (sum < 0)
            return 0;
        //If
        if (n <= 0)
            return 0;

        // count is sum of solutions (i)

        return count(coins, n - 1, sum)+ count(coins, n, sum - coins[n - 1]);

    }
    

	public static void main(String[] args) {
		 {
		        int coins[] = {1,2,3};
		        int n = coins.length;
		 
		        System.out.println(count(coins, n, 4));
		    }
		}
	}


