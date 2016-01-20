package test.sfa.util;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sfa.util.PrimeNumbersUtility;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

@RunWith(value = Parameterized.class)
public class IsPrimeNumberTest {

    @Parameterized.Parameter(value = 0)
    public int number;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    @Parameterized.Parameters(name = "{index}: isPrime({0}):{1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, true},
                { 3, true},
                { 4, false},
                { 5, true},
                { 6, false},
                { 7, true},
                { 8, false},
                { 9, false},
                { 10, false},
                { 11, true},
                { 12, false}
        });
    }

    @Test
    public void isPrimeTest(){
        assertThat(PrimeNumbersUtility.isPrime(number), is(expected));
    }

}
