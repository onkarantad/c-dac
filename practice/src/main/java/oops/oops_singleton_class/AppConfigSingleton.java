package oops.oops_singleton_class;

public class AppConfigSingleton {
    private AppConfigSingleton(){

    }

    private static AppConfigSingleton obj = null; //object

    public static AppConfigSingleton getInstance(){
        if(obj==null){
            obj = new AppConfigSingleton(); // object created
        }
        return obj;
    }
}
