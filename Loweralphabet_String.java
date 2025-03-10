import java.util.Scanner;
class  Loweralphabet_String
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.next();
		for (int i=0;i<=s.length()-1;i++ )
		{
             if (s.charAt(i)>='a'&&s.charAt(i)<='z')
             {
				 System.out.print(s.charAt(i));
             }
			
		}
		 System.out.println();
	}
}
