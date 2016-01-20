package sfa.util;

import java.util.AbstractList;
import java.util.ArrayList;

public class PrimeNumbersUtility {


    public static AbstractList<Integer> getPrimesLessThan(int number){
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=2; i< number; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }

        return primes;
    }

    public static boolean isPrime(int number){

        if(number < 3){
            return true;
        }

        if(number % 2 == 0){
            return false;
        }

        for(int i = 3; i*i <= number; i+=2){
            if(number % i == 0) {
                return false;
            }
        }

        return true;

    }

}
