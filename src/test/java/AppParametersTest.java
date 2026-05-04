package javaTesting;
import JavaTesting.Resources.AppParameters;
import org.junit.Assert;

import org.junit.Test;
import org.junit.Assert;
public class AppParametersTest {
    public static final String DOMAIN_EXPECTED="127.0.0.1";
    public static final String PORT_EXPECTED = "80";
    public static final String URL_EXPECTED = "https://"+DOMAIN_EXPECTED+":"+PORT_EXPECTED;
    @Test
    public void domainURLCorrect(){
        Assert.assertEquals("Retorna la part FQDN",DOMAIN_EXPECTED, AppParameters.DOMAIN);
    }
    public void correctPORT(){
        Assert.assertEquals("Retorna el port correcte",PORT_EXPECTED,AppParameters.PORT);
    }
    public void correctURL(){
        Assert.assertEquals("Retorna el URL correcte",URL_EXPECTED,AppParameters.deployedURL());
    }

}
