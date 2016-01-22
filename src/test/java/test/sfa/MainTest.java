package test.sfa;

import org.junit.Test;
import sfa.Main;

public class MainTest {


    @Test(expected = Exception.class)
    public void noArgumentShouldThrowException() throws Exception{

        Main.Main(new String[]{"1"});

    }



}
