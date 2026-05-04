package JavaTesting.Resources;

public class AppParameters {
    public static final String DOMAIN ="127.0.0.1";
    public static final String PORT = "80";
    //public static Object MESSAGES_TRANSLATIONS;

    //implementar SINGLETON una clase que solo se instancia una vez
    private static AppParameters instance=new AppParameters();
    private AppParameters(){

    }

    private void initApp(){

    }
    public void resetApp(){

    }


    public static AppParameters getInstance(){
        if(instance ==null)
            instance =new AppParameters();
        return instance;
    }

    public static String deployedURL(){
        return "http://"+DOMAIN+":"+PORT;
    }
}
