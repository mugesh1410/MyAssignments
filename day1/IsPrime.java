package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n1=7,n2=0;
		for (int i=2;i<=n2-1;i++)
		{
			if(n1%i==0) {
				n2++;
			}
		}
		
		if(n2==0) {
			System.out.println(n1+" is Prime Number");
		}
			else {
				System.out.println(n1+" is Not a Prime Number");
		}
	}

}
