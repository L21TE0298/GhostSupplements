package com.ghostappi.backend.repository;

import com.ghostappi.backend.model.SaleProduct;
import com.ghostappi.backend.model.SaleProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleProductRepository extends JpaRepository<SaleProduct, SaleProductPK> {
}
