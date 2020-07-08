package org.example.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 商品实体类
 */
@Data
@Table(name = "tb_product")
@Entity
public class Product {
    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price; //超过16位有效位的数进行精确的运算，而双精度浮点型变量double可以处理16位有效数
    private String productDesc;
    private String caption;
    private Integer inventory;
}
