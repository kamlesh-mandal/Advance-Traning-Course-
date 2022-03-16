package q2;

public class Problem2_2 {

		    public static void main(String[] args) {

		        int count = 13, num1 = 0, num2 = 1;
		        System.out.print("Fibonacci Series of "+count+" numbers:");

		        for (int i = 1; i <= count; ++i)
		        {
		            System.out.print(num1+" ");

		         
		            int sumOfPrevTwo = num1 + num2;
		            num1 = num2;
		            num2 = sumOfPrevTwo;
		        }
		    }
		}
	

