//get the number which is divisible by 3
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int[] a = new int[15];
    int i,count=0;
    Scanner input = new Scanner(System.in);
    System.out.println("enter the inputs for the array");
    for(i=0;i<15;i++)
  {
    a[i]=input.nextInt();
  }
  for(i=0;i<15;i++)
  {
      if(a[i]%3==0)
      {
      System.out.println(a[i] +"is divisible by 3");
      }
      else
      {
        count=count+1;
      }
  }
  if(count==0)
  {
     System.out.println("there is no number divisible by 3");   
  }
}
}
