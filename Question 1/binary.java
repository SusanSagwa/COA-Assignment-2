import java.util.Scanner;


public class binary  {
    
     public static void main(String[] args){
    int decNo, quot, i=1, j;
        int binNo[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        decNo = scan.nextInt();
		
        quot = decNo;
		
        while(quot != 0)
        {
            binNo[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binNo[j]);
        }
        System.out.print("\n");
    
     }
}
