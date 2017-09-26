package code;

//elab-source: Test.java
import java.util.Scanner;
public class Test {
	
	static int getTeddyFloor(String TeddyRoom){
		
		int teddyFloor = 0;
		if(TeddyRoom.equals("Lobby")){
			teddyFloor = 1;
		}
		else if(TeddyRoom.equals("Emergency Room")){
			teddyFloor = 2;
		}
		else if(TeddyRoom.equals("ICU")){
			teddyFloor = 3;
		}
		else if(TeddyRoom.equals("Pharmacy")){
			teddyFloor = 4;
		}
		else if(TeddyRoom.equals("Ward")){
			teddyFloor = 5;
		}
		else if(TeddyRoom.equals("Office")){
			teddyFloor = 6;
		}
		return teddyFloor;
		
	}
	
//	static int getNextFloor(String floorList, int i){
//		
//	}
	
	public static void main(String[] args){
	
    Scanner sc = new Scanner(System.in);
	System.out.print("Please input room where Teddy is: ");
	String TeddyRoom = sc.nextLine();
	System.out.print("Please input list of searching floors: ");
	String floorList = sc.nextLine();
	for(int i = 0; i < floorList.length(); i++){
		String floor  = floorList.substring(i, i+1);
		System.out.println(floor);
		
	}
	
	
}
	
	
	
	
	
//	public static double convertBitToByte(int bit){
//		double numbytes = 0;
//        String unit = "";
//		if(bit == 1){
//	        numbytes = bit/8;
//       	    unit = "Byte";
//       	    System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//		}
//		return numbytes;
//	}
//	     
//	 
//	     public static void main(String[] args) {
//	    	 Scanner sc = new Scanner(System.in);
//	         System.out.println("Welcome to conversion program");
//	         System.out.print("Input file size (bits): ");
//	         int bit = sc.nextInt();
//	         System.out.println("Which unit of your choice?");
//	         System.out.println("1. Byte");
//	         System.out.println("2. Kilobyte(KB)");
//	         System.out.println("3. Megabyte(MB)");
//	         System.out.println("4. Gigabyte(GB)");
//	         System.out.println("5. Terabyte(TB)");
//	         System.out.print("Input your choice: ");
//	         int choice = sc.nextInt();
//	         System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	         double numbytes = 0;
//	         String unit = "";
//	         switch(choice){
//	         case 1 :
//	        	 numbytes = bit/8;
//	        	 unit = "Byte";
//	        	 System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	        	 break;
//	         case 2 :
//	        	 numbytes = bit/(8*Math.pow(2, 10));
//	        	 unit = "KB";
//	        	 System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	        	 break;
//	         case 3 :
//	        	 numbytes = bit/(8*Math.pow(2, 20));
//	        	 unit = "MB";
//	        	 System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	        	 break;
//	         case 4 :
//	        	 numbytes = bit/(8*Math.pow(2, 30));
//	        	 unit = "GB";
//	        	 System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	        	 break;
//	         case 5 :
//	        	 numbytes = bit/(8*Math.pow(2, 40));
//	        	 unit = "TB";
//	        	 System.out.printf("%d bits = %.10f %s\n", bit, numbytes, unit);
//	        	 break;
//	         default :
//	        	 System.out.println("Invalid command!");
//	        	 break;		 
//	         }
	         
//	         System.out.print("Thank you for using conversion program.");
//	         
//	     }
	 

	
//	static int price(String course, String first){
//		int payment = 0;
//		if(first.equals("y")){
//			payment = -200;
//		}
//		switch(course){
//		case "Yoga" :
//			payment += 3000;
//			break;
//		case "Aerobic" :
//			payment += 4000;
//			break;
//		}
//		return payment;
//	}
//	
//		
//public static void main(String[] args) {
//	String course,first;
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter exercise class: ");
//	course = sc.nextLine();
//	System.out.print("Is it your first time taking the class (y/n)? ");
//	first = sc.nextLine();
//	int payment = price(course, first);
//	System.out.printf("Your payment is %d Baht.\n", payment);
//	}
//	
	

	
//	static int x;
//	static void method1(){
//		int x = 300;
//		System.out.printf("Inside method1(): x=%d",x );
//	}
//	public static void main(String[] args) {
//		x = 50;
//		method1();
//		System.out.printf("Inside main(): x=%d",x );
//	}
	
//	static Scanner sc = new Scanner(System.in);
//	static String readString(String prompt){
//		System.out.println(prompt);
//		return sc.nextLine();
//	}
//	
//	static int readInt(String prompt){
//		System.out.print(prompt);
//		return sc.nextInt();
//	}
//	
//	static void printString(String ph, int n){
//		for(int count = 1; count<=n; count++ ){
//			System.out.printf("%d. %s\n",count,ph);
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		String ph = readString("Enter phrase: ");
//		int n = readInt("How many times?: ");
//		printString(ph,n);
//	}
	
//	static void printString(String ph, int n){
//		for(int count = 1; count<=n; count++ ){
//			System.out.printf("%d. %s\n",count,ph);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter phrase: ");
//		String ph = sc.nextLine();
//		System.out.print("How many times?: ");
//		int n = sc.nextInt();
//		printString(ph,n);
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter phrase: ");
//		String ph = sc.nextLine();
//		System.out.print("How many times?: ");
//		int n = sc.nextInt();
//		for(int count = 1; count<=n; count++ ){
//			System.out.printf("%d. %s\n",count,ph);
//		}	
	
} 
