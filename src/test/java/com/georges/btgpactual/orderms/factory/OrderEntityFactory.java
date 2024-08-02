package com.georges.btgpactual.orderms.factory;

import com.georges.btgpactual.orderms.entity.OrderEntity;
import com.georges.btgpactual.orderms.entity.OrderItem;

import java.math.BigDecimal;
import java.util.List;

public class OrderEntityFactory {

    public static OrderEntity build(){

        var items = new OrderItem("notebook", 1, BigDecimal.valueOf(20.5));

        var entity = new OrderEntity();
        entity.setOrderId(1L);
        entity.setCustomerId(2L);
        entity.setTotal(BigDecimal.valueOf(20.5));
        entity.setItems(List.of(items));

        return entity;
    }
}
