package Array.java;
import java.util.Scanner;
public class EvenNumbers
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[]{1,2,3,4,5,6,7,8,9};//Array Declaration and value Assign
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)//To print even numbers
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}