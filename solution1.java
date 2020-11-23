public class Solution1
{
    static long countSquare(int n)
    {
        long count = 0;
        count = n * (n+1) * (2*n+1) /6;
      return count;  
    };
	public static void main(String[] args) {
	    int n = 101;
		long a = countSquare(n);
		System.out.print(a);
	}
}