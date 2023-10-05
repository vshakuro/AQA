package myOrg.com;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(factorial(-5));
    }
    public static int factorial(int number){
            int res = 1;
            for (int i = 2; i <= number; i++) {
                res = res * i;
            }
            return res;
    }
}
