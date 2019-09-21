import java.util.Scanner;

public class rate
{
	static int l;
	static int d,s;
	static float avg_score = 0;
	static int users;
	static float [] g = new float [] {0,0,0,0,0};
	static float highest_point, lowest_point;
	public static void main(String[] args) 
	{
		
		String[] imp_fac = {"Climate Change","Philosophy","Video Games","Science","Cinematography"};
		int[][] r = new int[5][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people will be taking the survey?");
		
		users = sc.nextInt();
		
		
		for(int i = 0; i < users; i++) 
		{
			for(int j = 0; j <= 4; j++) 
			{
				System.out.println("Rate how important the subject is to from 1-10\n" + (j + 1)+ ". " + imp_fac[j]);
				r[j][i] = sc.nextInt();
				
			}
		}
		System.out.println("\t Report Table");
		for(int u = 0; u < users; u++) 
		{
			System.out.print(" " + (u + 1));
		}
		System.out.println("\n-----------------------------------------------------------");
		for(int i = 0; i <= 4; i++) 
		{
			System.out.println((i + 1) + ". " + imp_fac[i]);
			for (int j = 0; j<=9; j++) {System.out.print(r[i][j] + "\t");
			g[i] = g[i] + r[i][j];
			}
			avg_score = g[i] / 10;
			System.out.println("Average = " + avg_score);
		}
		System.out.println("-----------------------------------------------------------");
		
		
		
		for(l = 0; l <= 4; l++)
		{
			if(l < g[l])
			{highest_point = g[l];}
			
			d = l;
		
		if(lowest_point > g[0])
		{lowest_point = g[0];
			s = l;
		}
		}
		
		
		
		System.out.printf("\nThe issue that recieved the highest average was " + imp_fac [d] + "The issue that recieved the lowest average was" + imp_fac[s]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
