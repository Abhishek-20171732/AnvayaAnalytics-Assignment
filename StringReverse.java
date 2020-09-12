import java.util.Scanner;

class StringReverse
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println();
		System.out.println(str);
		System.out.println(reverse(str));
		System.out.println();		
	}
	public static String reverse(String str)
	{
		char arr[] = str.toCharArray();
		int i=0,j=arr.length-1;
		while(i<=j)
		{
			char ch = arr[i];
			arr[i] = arr[j];
			arr[j] = ch;
			i++;
			j--;
		}
		return String.valueOf(arr);
	}
}
