package lamda_code_test;


import lamda_code.LamdaTest;
import org.junit.Assert;
import org.junit.Test;

public class TestLamdaCode {
    
    @Test
    public void testLamdTest() {
    
        String actualString= LamdaTest.test((a->a + " " + "anshul"));
        Assert.assertEquals("ans anshul",actualString);
        
        
        
    }
}
