
import java.util.*;

 

public class Even{

 

   public static void main(String []args)

   {

         

       Scanner X = new Scanner(System.in);

         

       System.out.print("Enter value n : ");

      int  n = X.nextInt();

         

       for(int i=0; i<=n; i++)

       {

           if(i%2==0)

               System.out.print(i+" ");

       }    

       System.out.println();

         

   }

}