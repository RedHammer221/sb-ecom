package com.ecommerce.project.service;

import com.ecommerce.project.payload.CartDTO;
import org.springframework.web.bind.annotation.PathVariable;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
