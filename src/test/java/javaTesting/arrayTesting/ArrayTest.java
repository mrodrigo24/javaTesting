package javaTesting.arrayTesting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class ArrayTest {
   @Test
    public void exempleArraySenzill(){
       String[] numerals={"zero","un","dos","tres"};
       assertEquals("zero",numerals[0]);
       String nombres="";
       for(String n:numerals){
           nombres += n + '|';
       }
       assertEquals(nombres,"zero|un|dos|tres|");
   }



}
