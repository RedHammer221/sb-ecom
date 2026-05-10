package com.ecommerce.project.payload;

import com.ecommerce.project.model.CartItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {
    private Long cartItemId;
    private CartItem cart;
    private List<ProductDTO> productDTO;
    private Integer quantity;
    private double discount;
    private double productPrice;
}
