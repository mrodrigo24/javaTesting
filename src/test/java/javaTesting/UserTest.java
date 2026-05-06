package javaTesting;
import DomainEntities.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest {

    @Test
    public void conturcUserTest(){
        User usuari =new User();
        asserTrue(usuari!=null);
        assertEquals(usuari.getName(),"Tomeu");
        assertEquals(usuari.getPassword(),"secret");

    }
}
