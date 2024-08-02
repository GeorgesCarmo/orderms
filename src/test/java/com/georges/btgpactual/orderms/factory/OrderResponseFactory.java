package com.georges.btgpactual.orderms.factory;

import com.georges.btgpactual.orderms.controller.dto.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.math.BigDecimal;
import java.util.List;

public class OrderResponseFactory {

    public static Page<OrderResponse> buildWithOneItem(){
        var orderResponse = new OrderResponse(1L, 2L, BigDecimal.valueOf(20.5));

        return new PageImpl<>(List.of(orderResponse));
    }
}
