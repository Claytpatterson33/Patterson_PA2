import java.util.Scanner;

public class bmicalc 
{	
	public static void main(String[] args) 
	{
		int y;
		double weight_pound, weight_kg, height_inch, height_meter, bmi_1, bmi_2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a Formula: \n1.(BMI = 703 x pounds/inches^2)\n2.(BMI = weight in kilograms/ height in meters^2)");
		System.out.println("If you want to use the first formula enter (1)\nIf you want to use the second formula enter(2)");
		y = sc.nextInt();
		if (y < 2)
		{
			System.out.println("Please enter your weight in pounds: \n");
			weight_pound = sc.nextFloat();
			System.out.println("Please enter your height in inches: ");
			height_inch = sc.nextFloat();
			bmi_1 = (703 * weight_pound) / (height_inch * height_inch) ; 
			System.out.println("Your BMI is: " + bmi_1);
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater)");
		
			
		
		
		}
			if (y > 1)
		{
			System.out.println("Please enter Your weight in kilograms: \n");
			weight_kg = sc.nextFloat();
			System.out.println("Please enter Your height in meters: \n");
			height_meter = sc.nextFloat();
			bmi_2 = weight_kg / (height_meter * height_meter);
			System.out.println("Your BMI is: " + bmi_2);
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
			}
			
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
