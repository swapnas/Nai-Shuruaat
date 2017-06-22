import java.util.Scanner;
import java.lang.Number;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        float num2,num1;
        Number sum;
        int count;
        System.out.println("Enter 1st number");
        num1 = sc.nextFloat();
        System.out.println("Enter 2nd number");
        num2 = sc.nextFloat();

        if(num1 %1 ==0 && num2 %1==0)
        {
           count=1;
        }
        else
        {
            count=0;
        }

        if(count==1)
        {
            int num3=(int)num1;
            int num4=(int)num2;
            sum = add(num3, num4);
        }
        else{
            sum=add(num1,num2);
        }

        System.out.println("here is the sum " +sum);

    }

    public static int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;

    }

    public static float add(float num1, float num2) {
        float sum;
        sum = num1 + num2;
        return sum;

    }

}
