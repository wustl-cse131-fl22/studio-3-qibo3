package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the range for the prime number: ");
	    Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int[] a = new int[range];
        for(int i=0;i<a.length-1;i++){
            a[i]=i+2;
        }
        for(int i=2;i<=a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]!=0){
                
                	 if(a[j]%i==0 && a[j]/i!=1 ){
                        a[j]=0;
        }
        }
        }
        }
        System.out.println("Prime number within "+range);        
        for(int i=0;i<a.length;i++ ) {
           if(a[i]!=0){
                System.out.println(a[i]+" ");
                
        }
        }
	}

}
