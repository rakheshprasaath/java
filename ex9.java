import java.util.Scanner; 
class ex9
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter 4 number");  
    double a=sc.nextDouble(); 
    double b=sc.nextDouble(); 
    double c=sc.nextDouble();
    double d=sc.nextDouble();


    {
	System.out.println((a * b - b * b) / (c - d)) ;
    }
    sc.close();
}
}