package javaTesting;
import JavaTesting.Resources.AppParameters;
import org.junit.Assert;

import org.junit.Test;
import org.junit.Assert;
public class AppParametersTest {
    public static final String DOMAIN_EXPECTED="10.0.0.1";
    public static final String PORT_EXPECTED = "80";

    @Test
    public void domainURLCorrect(){
        Assert.assertEquals("Retorna la part FQDN",DOMAIN_EXPECTED, AppParameters.DOMAIN);
    }
}
