package com.example.demograduate.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "product_detail", schema = "datn", catalog = "")
public class ProductDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "quantity", nullable = true, length = 255)
    private String quantity;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "productDetailByProductDetailId")
    private Collection<OrderDetail> orderDetailsById;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product productByProductId;
    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private Size sizeBySizeId;
    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private Color colorByColorId;
    @OneToMany(mappedBy = "productDetailByProductDetailId")
    private Collection<ProductPromotion> productPromotionsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetail that = (ProductDetail) o;
        return Objects.equals(id, that.id) && Objects.equals(code, that.code) && Objects.equals(quantity, that.quantity) && Objects.equals(price, that.price) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, quantity, price, createdAt, updatedAt);
    }

    public Collection<OrderDetail> getOrderDetailsById() {
        return orderDetailsById;
    }

    public void setOrderDetailsById(Collection<OrderDetail> orderDetailsById) {
        this.orderDetailsById = orderDetailsById;
    }

    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    public Size getSizeBySizeId() {
        return sizeBySizeId;
    }

    public void setSizeBySizeId(Size sizeBySizeId) {
        this.sizeBySizeId = sizeBySizeId;
    }

    public Color getColorByColorId() {
        return colorByColorId;
    }

    public void setColorByColorId(Color colorByColorId) {
        this.colorByColorId = colorByColorId;
    }

    public Collection<ProductPromotion> getProductPromotionsById() {
        return productPromotionsById;
    }

    public void setProductPromotionsById(Collection<ProductPromotion> productPromotionsById) {
        this.productPromotionsById = productPromotionsById;
    }
}
