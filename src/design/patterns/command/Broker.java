package design.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/22 18:28:19
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
