package Test;

public class AllStar {

			public static void main(String[] args) {
		//1.square pattern
				
				for(int i=1; i<=5; i++)
				{
					for(int j=1; j<=5; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				System.out.println();
				
		//2.increasing right triangle	
//				*
//				* *
//				* * *
//				* * * *
//				* * * * *
				int star=5;
				for(int i=1; i<=star; i++)
				{
					for(int j=1; j<=i; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				System.out.println();
		//3.decreasing right triangle		
				
				int n=5;
				for(int i=1; i<=5; i++)
				{
					for(int j=i; j<=n; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				System.out.println();
		//4.right sided triangle	
			int n1=5;
			for(int i=1; i<=n1; i++)
			{
				for (int j=i; j<=n1; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		}

	

