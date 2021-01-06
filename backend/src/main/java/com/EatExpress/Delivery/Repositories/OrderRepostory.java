package com.EatExpress.Delivery.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EatExpress.Delivery.Entities.Order;

public interface OrderRepostory extends JpaRepository<Order, Long>{

}
