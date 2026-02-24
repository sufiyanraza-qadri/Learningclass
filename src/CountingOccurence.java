import java.util.Scanner;

public class CountingOccurence {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count =0;
        int fn;
        int Sn;

        System.out.print("Enter the first number:");
        fn=scanner.nextInt();

        System.out.print("Enter the Second number:");
        Sn=scanner.nextInt();

        while(fn>0){
            int rem=fn%10;
            if(rem==Sn){
                count++;
            }
            fn=fn/10;

        }
        System.out.println(count);




     }
}
