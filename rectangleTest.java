import java.util.Scanner;
public class rectangleTest {
	
	

	public static void main(String[]args) {
		
		
		  
	
	for(int i = 0; i<5;i++) {
		

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println( "What is length");
		 int length  = scan.nextInt();
		
		System.out.println( "What is width");
		 int width  = scan.nextInt();
		 rectangle scoopscoop = new rectangle (length,width);
        System.out.println("The  parameter is "+ scoopscoop.perameter());
        System.out.println("The area is "+ scoopscoop.area());
        
        
}
}}