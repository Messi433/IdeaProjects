package org.example.product.dao;


import org.example.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 继承接口
 */
public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product>  {
//JpaRep..<实体类，主键类型>
//JpaSpec..<实体类>
}
