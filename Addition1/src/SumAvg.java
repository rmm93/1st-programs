import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num1 , num2, sum;
        num1= input.nextInt();
        num2= input.nextInt();
        sum= num1+ num2;
        double avg= (double)sum /2;
        String msg= "Sum is";
        System.out.printf("%s %d \n" + msg+ sum);
        System.out.printf("AVG is %.2f \n"+ avg);
    }
}
