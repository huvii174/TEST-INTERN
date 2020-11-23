public class Solution1
{
    static long countSquare(int n)
    {
        long count = 0;
        for (int i = 1;i<=n;i++)
        {
            count += i*i;
        }
      return count;  
    };
	public static void main(String[] args) {
	    int n = 101;
		long a = countSquare(n);
		System.out.print(a);
	}
}