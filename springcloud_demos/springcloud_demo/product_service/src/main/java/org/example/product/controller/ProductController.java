package org.example.product.controller;

import org.example.product.domain.Product;
import org.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Restful风格
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String save(@RequestBody Product product) {
        productService.save(product);
        return "保存成功";
    }
}
