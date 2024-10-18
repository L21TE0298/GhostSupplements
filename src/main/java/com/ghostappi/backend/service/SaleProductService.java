package com.ghostappi.backend.service;


import com.ghostappi.backend.model.SaleProduct;
import com.ghostappi.backend.repository.SaleProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;

@Service
@Transactional

public class SaleProductService {

        @Autowired
    private SaleProductRepository repository;

    public List<SaleProduct> getAll(){ return repository.findAll(); }

    public void save(SaleProduct saleProduct){
        repository.save(saleProduct);
    }
}
