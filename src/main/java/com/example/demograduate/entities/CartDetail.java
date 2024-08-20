package com.example.demograduate.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cart_detail", schema = "datn", catalog = "")
public class CartDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "quantity", nullable = true, length = 255)
    private String quantity;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "total_price", nullable = true, precision = 0)
    private Double totalPrice;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Account accountByCustomerId;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product productByProductId;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orders ordersByOrderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartDetail that = (CartDetail) o;
        return Objects.equals(id, that.id) && Objects.equals(quantity, that.quantity) && Objects.equals(price, that.price) && Objects.equals(totalPrice, that.totalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, price, totalPrice);
    }

    public Account getAccountByCustomerId() {
        return accountByCustomerId;
    }

    public void setAccountByCustomerId(Account accountByCustomerId) {
        this.accountByCustomerId = accountByCustomerId;
    }

    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    public Orders getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(Orders ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }
}
