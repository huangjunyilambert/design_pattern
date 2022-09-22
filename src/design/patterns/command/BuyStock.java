package design.patterns.command;

/**
 * @author huangjunyi
 * @date 2022/9/22 18:27:20
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
