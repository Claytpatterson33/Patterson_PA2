import java.util.Scanner;
public class Encrypt
{
	public static void main(String[] args) {
	int a, b, c, d, encryp_num, decryp_num, temp, num_8, num_data, t;
	Scanner sc = new Scanner(System.in);
	Scanner reader = new Scanner(System.in);
    System.out.println("Enter a four digit number: (ex:1234)");
    t = sc.nextInt();
    num_data =  temp = t;
    a = ((temp/1000) + 7) % 10;
    temp = temp%1000;
    b = ((temp/100) + 7) % 10;
    temp = temp%100;
    c = ((temp/10) + 7) % 10;
    temp = temp%10;
    d = (temp + 7) % 10;
    encryp_num = c * 1000 + d * 100 + a*10 + b;
    System.out.printf("Your encrypted number is: " + encryp_num);
    int temp_2, t_2, num_16, num_data2;
    System.out.println("\nEnter a encrypted number to be decrypted");
    t_2 = sc.nextInt();
    
    
    
    num_data2 = temp_2 = t_2;
    a = ((temp_2/1000) + 3) % 10;
    temp_2 = temp_2%1000;
    b = ((temp_2/100) + 3) % 10;
    temp_2 = temp_2%100;
    c = ((temp_2/10) + 3) % 10;
    temp_2 = temp_2%10;
    d = (temp_2 + 3) % 10;
    
    decryp_num = (c * 1000) + (d * 100) + (a*10) + (b);
   
    System.out.printf("Your decrypted number is: " + decryp_num);	
	}	
}