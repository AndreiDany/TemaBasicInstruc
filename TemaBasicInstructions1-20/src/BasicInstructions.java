
import java.util.Scanner;

public class BasicInstructions {

	
	public static void main(String[] args) {
	
		//CitireNumarMaiMare5();
		//CitireNumarIntre1si5();
		//SetPareSauImpare();
		//ValoareMinima();
		//SumaPrimelePare();
		//SumaPrimeleImare();
		//MedieAritmetica();
		//Factorial();
		//Prim();
		//PrimMaiMare1000();
		//DivizoriN();
		//DivizoriPrimi();
		//Suma1000();
		//Suma1000_2();
		//Numere3a2bDiv9();
		//CifreleUnuiNumar();
		//CifraMax();
		//CifraMin();
		Inversul();
		Oglinditul();

	}
	
	public static void CitireNumarMaiMare5()
	{   
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n<1||n>10)
			System.out.println("INVALID");
		else
			if(n>5)
				System.out.println("ADMIS");
			else
				System.out.println("RESPINS");
	}
	
	public static void CitireNumarIntre1si5()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n)
		{
		case 1: {System.out.println("UNU"); break;}
		case 2: {System.out.println("DOI"); break;}
		case 3: {System.out.println("TREI"); break;}
		case 4: {System.out.println("PATRU"); break;}
		case 5: {System.out.println("CINCI"); break;}
		default:{System.out.println("INVALID");}
		}
	}
	
	public static void SetPareSauImpare()
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if(a%2==0&&b%2==0)
			System.out.println((a+b)/2);
		else if(a%2!=0&&b%2!=0)
			System.out.println((a*b));
		else System.out.println((a+b));
	}
	
	public static void ValoareMinima()
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c  = input.nextInt();
		if(a<b&&a<c)
			System.out.println(a);
		else if(b<a&&b<c)
			System.out.println(b);
		else
			System.out.println(c);
		
	}
	
	public static void SumaPrimelePare()
	{
		int s=0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=2;
		while(i<=n)
		{
			if(i%2==0)
				s=s+i;
			i++;
		}
		System.out.println(s);
	}
	
	public static void SumaPrimeleImare()
	{
		int s=0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
				s=s+i;
			i++;
		}
		System.out.println(s);
	}
	
	public static void MedieAritmetica()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		double s=0;
		
		for(int i=1; i<=n; i++)
		{
			int x = input.nextInt();
			s=s+x;
		}
		
		System.out.println((s/2));
	}
	
	public static void Factorial()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int factorial=1;
		
		for(int i=1; i<=n; i++)
		{
			
			factorial = factorial*i;
		}
		System.out.println((factorial));
	}
	
	public static void Prim()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
			boolean prim=true;
			
			if(n%2==0&&n!=2) prim=false;
			else for(int d=3; d*d<=n; d=d+2)
					if(n%d==0)
					{
						prim=false;
						break;
					}
			if(prim==true)
			{
				System.out.println("Prim");
			}
			else
			{
				System.out.println("nu este prim");
			}
				
	}
	
	public static void PrimMaiMare1000()
	{
		boolean gasit=false;
		int n=1000;
		
		while(!gasit)
		{
			boolean prim=true;
			
			if(n%2==0) prim=false;
			else for(int d=3; d*d<=n; d=d+2)
					if(n%d==0)
					{
						prim=false;
						break;
					}
			if(prim==true)
			{
				gasit=true;
				System.out.println(n);
			}
			n++;
		}
		
	}
	
	public static void DivizoriN()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=1; i*i<=n; i++)
		{
			System.out.println(i);
			System.out.println(n/i);
		}
	}
	
	public static void DivizoriPrimi()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=3; i<=n; i++)
		{
			boolean prim=true;
			
			if(i%2==0) prim=false;
			else for(int d=3; d*d<=i; d=d+2)
					if(i%d==0)
					{
						prim=false;
						break;
					}
			if(prim==true)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void Suma1000()
	{
		for(int i=1; i<=1000/17; i++)
		{
			for(int j=1; j<=1000/19; j++)
			{
				if(i*17+j*19==1000)
					System.out.println(i*17 + " " + j*19);
			}
		}
	}
	
	public static void Suma1000_2()
	{
		for(int i=1; i<=1000/13; i++)
		{
			for(int j=1; j<=1000/7; j++)
			{
				if(i*17+j*19==1000)
					System.out.println(i*17 + " " + j*19);
				else if(i*13+j*7==1000)
					System.out.println(i*13 + " " + j*7);
				else if(i*13+j*19==1000)
					System.out.println(i*13 + " " + j*19);
				else if(i*17+j*7==1000)
					System.out.println(i*17 + " " + j*7);
			}
		}
	}
	
	public static void Numere3a2bDiv9()
	{   
		
		for(int i=0; i<=9; i++)
		{	
			for(int j=0; j<=9; j++)
			{
				int n=3020+100*i+j;
				if(n%9==0)
					System.out.println(n);	
			}
		}
	}
	
	public static void CifreleUnuiNumar()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n!=0)
		{
			System.out.println(n%10);
			n=n/10;
		}
	}
	
	public static void CifraMax()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int maxx=0;
		
		while(n!=0)
		{
			if(n%10>maxx)
				maxx=n%10;
			n=n/10;
		}
		
		System.out.println(maxx);
	}
	
	public static void CifraMin()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int minn=9;
		
		while(n!=0)
		{
			if(n%10<minn)
				minn=n%10;
			n=n/10;
		}
		
		System.out.println(minn);
	}
	
	public static void Inversul()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int nr=0;
		
		while(n!=0)
		{
			nr=nr*10+n%10;	
			n=n/10;
		}
		
		System.out.println(nr);
	}
	
	public static void Oglinditul()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int og=0;
		int nr=n;
		
		while(n!=0)
		{
			og=og*10+n%10;	
			n=n/10;
		}
		
		if(nr==og)
			System.out.println("Palindrom");
		else
			System.out.println("Nu este palindrom");
	}
}


