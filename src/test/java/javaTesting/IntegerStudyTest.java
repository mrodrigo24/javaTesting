package javaTesting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerStudyTest {
    @Test
    public void IntegerStudy() {

    Integer vuit = new Integer(8);
    Integer vint = new Integer(20);
    Integer tretze = 13;
    int esperat = 13;
        int minin =-2147483648;
    assertEquals("El numero tretze va relamente 13",esperat, tretze.intValue());
    assertEquals("El numero tretze va relamente 13",20,vint.intValue());
        assertEquals("El valor minimo de un int es -2147483648",minin,Integer.MIN_VALUE);
}
    @Test
    public void IntegerComparationStudy() {

        Integer vuit = new Integer(8);
        Integer eight = new Integer(8);
        //String tiposPersonas="Hi Ha " +Integer.toBinaryString(dos)+"de personas, les qu enttenen binari y las que no";
        assertEquals("El numero tretze va relamente 8",8, vuit.intValue());
        assertEquals("El numero tretze va relamente 13",8,eight.intValue());
        //assertTrue(vuit==eight);
        assertTrue(vuit.equals(eight));
    }
    @Test
    public void binaryStudy(){
        Integer dos=new Integer(2);
        Integer vint=new Integer(20);
        Integer tretze= 13;
        String tipusPersonas="HI ha"+Integer.toBinaryString(dos)+"de persones, les que entenen binari i las que NO!";
        assertEquals(tipusPersonas,13, tretze.intValue());
        // assertEquals("El nombre cint val realmen 20"),20,vint.intValue());
    }
    }


