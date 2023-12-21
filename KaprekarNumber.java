import java.util.Scanner;

public class KaprekarNumber 
{
   public static boolean isKaprekar(int number)  
{

     
      int square = 0;
      int temp = 0;
      int countDigits = 0;
      int firstPart = 0;
      int secondPart = 0;
      int sum = 0;
      square = number * number;
      temp =square;
      while(temp!=0) {
         countDigits++;
         temp /= 10; 
      }
      for(int i=countDigits-1; i>0; i--) {
         firstPart = square / (int)Math.pow(10, i);
         secondPart = square % (int)Math.pow(10, i);
         if(firstPart == 0 || secondPart == 0)
         	continue;
         
         sum = firstPart + secondPart;
         if( sum == number )
         return true;
      }
      return false;
   }

   public static void main(String[] args) 
{
      int number = 0;
      Scanner scan =  new Scanner(System.in);
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();
      if(isKaprekar(number))
      System.out.println(number+" is a"
		    	+ " kaprekar number");
      else
      System.out.println(number+" is not a"
	      	  	+ " kaprekar number");
      scan.close();
   }
}