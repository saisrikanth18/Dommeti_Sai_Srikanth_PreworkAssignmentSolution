import java.util.Scanner;

class PreworkAssignment
{

		//Palindrome

	   public void CheckPalindrome(){

	  
	      String original, reverse = ""; // Objects of String class

	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = sc.nextLine();

	      int length = original.length();

	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.\n");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.\n");   
	   }  
	  
	   //print pattern

		public void printPattern()
		{
		
			int i, j, rows;

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no.of rows : ");
			rows = sc.nextInt();

			for (i=rows-1;i>=0 ;i-- )
			{
				for (j=0;j<=i ;j++)
				{
					System.out.print("*");
				}
				System.out.println("\n");
			}
		}
	  
		//prime number.

		public void checkPrime() {  
	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = sc.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	    }  
	  
	   	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < n; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	    }  
	 
 		// Fibonacci Series.

		public void fibonacciSeries(){

	        int n, a = 0, b = 0, c = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = sc.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }
	 
	 //main method which contains switch and do while loop

      public static void main(String[] args) {

                PreworkAssignment obj = new PreworkAssignment();

                int choice;

                Scanner sc = new Scanner(System.in);
	do {

	System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();

		choice = sc.nextInt();

	switch (choice) {

	case 0:

	choice = 0;

	break;

	case 1: 
    {
		obj.CheckPalindrome();
	}

	break;

	case 2: 
    {
		obj.printPattern();
	}

	break;

	case 3: 
    {
		obj.checkPrime();
	}

	break;

	case 4: 
    {
		obj.fibonacciSeries();
	}

	break;

	default:

	System.out.println("Invalid choice. Enter a valid no.\n");

	}

	} while (choice != 0);

	System.out.println("Exited Successfully!!!");

	sc.close();

	}

}
