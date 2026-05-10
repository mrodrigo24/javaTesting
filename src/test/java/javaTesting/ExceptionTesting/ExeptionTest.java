package javaTesting.ExceptionTesting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ExeptionTest {
   @Test(expected = NullPointerException.class)
    public void NullPointerTest(){
       Integer edad=null;
       String edatEnLetres=edat.toString();
       assertEquals("**18", edatEnLetres);
   }

   @Test
    public void catchNullPointerTest(){
       Integer edat=null;
       String edatEnletres;
       try{
           edatEnletres=edat.toString();

       } catch (NullPointerException){
           edat=18;
           edatEnletres=edat.toString();
       }
       assertEquals("**18", edatEnletres);
   }

   @Test(expected = IllegalArgumentException.class)
   public void throwingIllegalArgumentExceptiontryCatchNullPointerTest(){
       Integer edat=null;
       String edatEnLetres="";
       String text;

       try {
           System.out.println("Passa 1 - gerneram NullPointerException");
           edatEnLetres = edat.toString();
       }catch(NullPointerException npe) {
           System.out.println("Passa 2 - capturam la NULLPointerException");
           System.out.println("Passa 3 - Anam a llancar excepcio");
           throw new IllegalArgumentException("excepcion creada i llancada per mi");
       }finally{
           System.out.println("passa final - codi de tancament");
       }
       }

       @Test(expected = NullPointerException.class)
       public void excepcioErronia(){
       Integer edat = null;
       String edatEnLetres="";
       String text;
           try {
               System.out.println("Passa 1 - gerneram NullPointerException");
               edatEnLetres = edat.toString();
               throw new IllegalArgumentException("excepcion creada i llancada per mi");
           }catch(IllegalArgumentException e) {
               System.out.println("Passa 2 - capturam la NULLPointerException");

           }finally{
               System.out.println("passa final - codi de tancament");
           }
       }

     @Test
    public void jugantAmbObjecteExcepcioTest{
       Integer edat=null;
       String edatEnLetres;

       try{
           edatEnLetres=edat.toString();
       } catch (NullPointerException npe){
           edat= 18;
           edatEnLetres=edat.toString();
           System.out.println("Anem a jugar amb el objecvte exception !!!!1");
           System.out.println(npe.getMessage());
           System.out.println(npe.getStackTrace());
           npe.printStackTrace();
       }
       assertEquals("**18",edatEnLetres);
    }


}
