package design.patterns.command;

/**
 * @author huangjunyi
 * @date 2022/9/22 18:27:51
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
