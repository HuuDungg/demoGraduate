package com.example.demograduate.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Orders {
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "order_date", nullable = true)
    private Timestamp orderDate;
    @Basic
    @Column(name = "delivery_fee", nullable = true, precision = 0)
    private Double deliveryFee;
    @Basic
    @Column(name = "total_amount", nullable = true, precision = 0)
    private Double totalAmount;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<CartDetail> cartDetailsById;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<OrderDetail> orderDetailsById;
    @ManyToOne
    @JoinColumn(name = "voucher_id", referencedColumnName = "id")
    private Voucher voucherByVoucherId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Account accountByCustomerId;
    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName = "id")
    private Account accountByStaffId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
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
        Orders orders = (Orders) o;
        return Objects.equals(status, orders.status) && Objects.equals(orderDate, orders.orderDate) && Objects.equals(deliveryFee, orders.deliveryFee) && Objects.equals(totalAmount, orders.totalAmount) && Objects.equals(createdAt, orders.createdAt) && Objects.equals(updatedAt, orders.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, orderDate, deliveryFee, totalAmount, createdAt, updatedAt);
    }

    public Collection<CartDetail> getCartDetailsById() {
        return cartDetailsById;
    }

    public void setCartDetailsById(Collection<CartDetail> cartDetailsById) {
        this.cartDetailsById = cartDetailsById;
    }

    public Collection<OrderDetail> getOrderDetailsById() {
        return orderDetailsById;
    }

    public void setOrderDetailsById(Collection<OrderDetail> orderDetailsById) {
        this.orderDetailsById = orderDetailsById;
    }

    public Voucher getVoucherByVoucherId() {
        return voucherByVoucherId;
    }

    public void setVoucherByVoucherId(Voucher voucherByVoucherId) {
        this.voucherByVoucherId = voucherByVoucherId;
    }

    public Account getAccountByCustomerId() {
        return accountByCustomerId;
    }

    public void setAccountByCustomerId(Account accountByCustomerId) {
        this.accountByCustomerId = accountByCustomerId;
    }

    public Account getAccountByStaffId() {
        return accountByStaffId;
    }

    public void setAccountByStaffId(Account accountByStaffId) {
        this.accountByStaffId = accountByStaffId;
    }
}
