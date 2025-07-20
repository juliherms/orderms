package com.github.juliherms.orderms.listener.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCLiente,
                                List<OrderItemEvent> itens) {
}
