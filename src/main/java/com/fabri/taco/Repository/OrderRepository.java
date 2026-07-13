package com.fabri.taco.Repository;

import com.fabri.taco.Domain.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
