package oops.oops_singleton_class;

public class TestAppConfig {
    public static void main(String args[]){
        AppConfigNormal n1 = new AppConfigNormal();
        AppConfigNormal n2 = new AppConfigNormal();
        System.out.println("n1 : " + n1.hashCode());
        System.out.println("n2 : " + n2.hashCode());

        AppConfigSingleton s1 = AppConfigSingleton.getInstance();
        AppConfigSingleton s2 = AppConfigSingleton.getInstance();
        System.out.println("s1 : " + s1.hashCode());
        System.out.println("s1 : " + s2.hashCode());


        System.out.println("normal : " + (n1==n2));
        System.out.println("normal : " + (s1==s2));



    }
}
