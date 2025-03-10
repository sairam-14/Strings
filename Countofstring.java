import java.util.Scanner;
class  Countofstring
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.next();
		int uppercount=0;
		int lowercount=0;
		int digitcount=0;
		int symbolcount=0;
		for (int i=0;i<=s.length()-1 ;i++ )
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				uppercount++;
		}else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
			lowercount++;
		}else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
             digitcount++;
		}else{
			symbolcount++;
		}
	}
	System.out.println("Upper case:"+uppercount);
	System.out.println("Lower case:"+lowercount);
	System.out.println("Digit count:"+digitcount);
	System.out.println("Symbolcount:"+symbolcount);

}
}