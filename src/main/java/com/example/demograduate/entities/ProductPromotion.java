package com.example.demograduate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_promotion", schema = "datn", catalog = "")
public class ProductPromotion {
    @ManyToOne
    @JoinColumn(name = "promotion_id", referencedColumnName = "id", nullable = false)
    private Promotion promotionByPromotionId;
    @ManyToOne
    @JoinColumn(name = "product_detail_id", referencedColumnName = "id", nullable = false)
    private ProductDetail productDetailByProductDetailId;

    public Promotion getPromotionByPromotionId() {
        return promotionByPromotionId;
    }

    public void setPromotionByPromotionId(Promotion promotionByPromotionId) {
        this.promotionByPromotionId = promotionByPromotionId;
    }

    public ProductDetail getProductDetailByProductDetailId() {
        return productDetailByProductDetailId;
    }

    public void setProductDetailByProductDetailId(ProductDetail productDetailByProductDetailId) {
        this.productDetailByProductDetailId = productDetailByProductDetailId;
    }
}
