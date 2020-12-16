import java.util.Scanner;
public class Hexadecimal {
    

    public static void main(String[] args) {
        int decNo, rem;
        String hexdecNo="";
        
        
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
        
       
        System.out.print("Input a decimal number: ");
        decNo = in.nextInt();
	
       
		
       
        while(decNo>0)
        {
            rem = decNo%16;
            hexdecNo = hex[rem] + hexdecNo;
            decNo = decNo/16;
            
        }
        System.out.print("Hexadecimal number is : "+hexdecNo+"\n"); 
        
        
    }
    }
