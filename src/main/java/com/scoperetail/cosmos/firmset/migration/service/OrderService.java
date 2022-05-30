package com.scoperetail.cosmos.firmset.migration.service;

import com.scoperetail.cosmos.firmset.migration.dto.OrderResponse;
import com.scoperetail.cosmos.firmset.migration.repository.SupplierOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {
    @Autowired
    SupplierOrderRepo supplierOrderRepo;

    public List<OrderResponse> getAllFrimSetOrders(){
        return supplierOrderRepo.getAllFirmSetOrders();
    }
}
