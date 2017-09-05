/* 
Name: Rahul Prakash Sonwalkar
Date: 09/04/2017
Implementation of Sieve of Erotosthenes Algorithm to find all prime numbers upto N.
*/

import java.util.*;

public class ComputePrimes{
    public static void main(String[] args) {
        
        System.out.println("Implementation of Sieve of Erotosthenes to compute primes");
        System.out.println(" ");
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter the limit: ");
        int n = reader.nextInt();
        
        printPrimes(n);
        
    }
    
    public static void printPrimes(int n) {
        
        boolean[] array = new boolean[n+1];
        
        //initialize array
        for (int i = 0; i <= n; i++) {
            if(i == 0 || i == 1) {
             array[i] = false;
            }
            else {
             array[i] = true;   
            }
        }
        
        //compute primes
            for (int counter = 2; counter < n; counter++) {
               for (int i = counter*counter; i <= n; i++) {
                   if(i%counter == 0) {
                       array[i] = false;
                   }
               } 
            }
        
        //print primes
        System.out.println("Here are the prime numbers till " + n + ": ");
        for (int i = 0; i <= n; i++) {
            if(array[i])
                 System.out.println(i);
        }
    }
}
