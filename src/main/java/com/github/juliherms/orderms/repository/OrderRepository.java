package com.github.juliherms.orderms.repository;

import com.github.juliherms.orderms.controller.dto.OrderResponse;
import com.github.juliherms.orderms.entitiy.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity,Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
