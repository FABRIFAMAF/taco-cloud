package com.fabri.taco.Repository.jdbc;

import com.fabri.taco.Domain.TacoOrder;

public interface JdbcOrderOperations {

    TacoOrder save(TacoOrder order);
}
