//fibonaic
public class Main
{
 public static void main(String[] args)
  {
        int n,a=0,b=1;
        System.out.print("enter the value n  ");
        n=s.nextInt();
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + " + ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}