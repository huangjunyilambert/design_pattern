package design.patterns.singleton;

/**
 * @author huangjunyi
 * @date 2022/9/19 16:04:38
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
