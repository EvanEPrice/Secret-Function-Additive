package test.sfa.util;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sfa.util.PrimeNumbersUtility;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.AbstractList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberLessThanTest {


    @Test
    public void primeNumberLessThan12(){
        AbstractList<Integer> primes =  PrimeNumbersUtility.getPrimesLessThan(12);
        assertThat(primes.size(), is(5));
        assertThat(primes.contains(2), is(true));
        assertThat(primes.contains(11), is(true));
    }

    @Test
    public void primeNumberLessThan24(){
        AbstractList<Integer> primes =  PrimeNumbersUtility.getPrimesLessThan(24);
        assertThat(primes.size(), is(9));
        assertThat(primes.contains(2), is(true));
        assertThat(primes.contains(23), is(true));
    }

}
