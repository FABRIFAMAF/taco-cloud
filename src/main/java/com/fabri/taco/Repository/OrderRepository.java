package com.fabri.taco.Repository;

import org.springframework.data.repository.CrudRepository;

import com.fabri.taco.Domain.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    
}
