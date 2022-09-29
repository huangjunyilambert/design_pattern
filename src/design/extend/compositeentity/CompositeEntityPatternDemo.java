package design.extend.compositeentity;

/**
 * @author huangjunyi
 * @date 2022/9/29 13:42:30
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
