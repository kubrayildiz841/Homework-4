package csd;

public class App {

	public static void main(String[] args) {
		
		java.util.Scanner kb=new java.util.Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		long a=Long.parseLong(kb.nextLine());
	NumberU.displayDuration(a);
	}
		
}
	class NumberU {
public static void displayDuration (long val)
{	
	long sa,dk,sn;
	sn=val%60;
	dk=(val/60)%60;
	sa=val/3600;
	if (sa!=0)
		System.out.printf("%d saat%n",sa);
	if (dk!=0)
		System.out.printf("%d dakika%n",dk);
	if (sn!=0)
		System.out.printf("%d saniye%n",sn);
	
	
	}
	
	
}