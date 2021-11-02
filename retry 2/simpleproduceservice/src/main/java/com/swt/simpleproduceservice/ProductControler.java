package com.swt.simpleproduceservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.swt.simpleproduceservice.model.*;

import java.math.BigDecimal;

@RestController
public class ProductControler {

    @GetMapping("/product")
    public Product getProduct(){
        return new Product(1,"Apple Watch", BigDecimal.valueOf(300.00), 10, "Apple Watch");
    }
}
