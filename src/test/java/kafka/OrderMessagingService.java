package kafka;

import tacos.Order;

public interface OrderMessagingService {

    void sendOrder(Order order);

}