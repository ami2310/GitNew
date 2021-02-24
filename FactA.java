package SecondRepo;
import java.util.*;
public class FactA {
    public static void main(String arr[])
    {
        int fact=1,num,i=0;

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Fact"+fact);
    }
    
}
