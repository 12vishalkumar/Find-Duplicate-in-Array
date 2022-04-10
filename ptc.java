import java.util.ArrayList;
import java.util.*;
public class ptc
{
    public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        // Write your code here.
		Collections.sort(arr);
		System.out.println(arr);
        for(int i=0;i<n-1;i++)
        {
			if(arr.get(i)==arr.get(i+1))
				return arr.get(i);
		}
		return -1;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int T = sc.nextInt();
		for(int j=0;j<T;j++)
		{
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int el = sc.nextInt();
				arr.add(el);
			}
			System.out.println(findDuplicate(arr, n));
		}
    }
}
