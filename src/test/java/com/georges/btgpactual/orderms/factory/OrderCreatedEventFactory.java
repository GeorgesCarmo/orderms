package com.georges.btgpactual.orderms.factory;

import com.georges.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import com.georges.btgpactual.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent buildWithOneItem(){

        var items = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.5));

        return new OrderCreatedEvent(1L, 2L, List.of(items));
    }

    public static OrderCreatedEvent buildWithTwoItems(){

        var item1 = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.5));
        var item2 = new OrderItemEvent("mouse", 1, BigDecimal.valueOf(35.5));

        return new OrderCreatedEvent(1L, 2L, List.of(item1, item2));
    }
}
