package sfa;

import sfa.secret.AdditiveSecret;
import sfa.secret.NonAdditiveSecret;
import sfa.secret.Secret;
import sfa.util.PrimeNumbersUtility;

import java.util.AbstractList;

public class Main {


    public static void main(String[] args) throws Exception {

        int input;

        try{
            input = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e){
            throw new Exception("Incorrect format. Number expected.");
        }
        catch(IndexOutOfBoundsException e){
            throw new Exception("No argument supplied.");
        }

        boolean setAdditive = input > 100;

        Secret secret = new NonAdditiveSecret();

        if(setAdditive){
            secret = new AdditiveSecret();
        }

        boolean isAdditive = checkForAdditive(secret, input);

        System.out.println("Secret is additive :" + isAdditive);


    }

    private static boolean checkForAdditive(Secret secret, int input){
        AbstractList<Integer> primes = PrimeNumbersUtility.getPrimesLessThan(input);
        for (int x:primes) {
            for(int y : primes){
                int sumOfResults = secret.secret(x) + secret.secret(y);
                int resultsOfSum = secret.secret(x + y);

                if(sumOfResults == resultsOfSum){
                    return true;
                }

            }
        }

        return false;
    }
}
