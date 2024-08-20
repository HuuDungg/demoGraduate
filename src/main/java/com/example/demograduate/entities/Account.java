package com.example.demograduate.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "username", nullable = true, length = 255)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 20)
    private String phoneNumber;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "salary", nullable = true, precision = 0)
    private Double salary;
    @Basic
    @Column(name = "date_of_birth", nullable = true)
    private Timestamp dateOfBirth;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "hire_date", nullable = true)
    private Timestamp hireDate;
    @Basic
    @Column(name = "notes", nullable = true, length = 255)
    private String notes;
    @Basic
    @Column(name = "gender", nullable = true, length = 255)
    private String gender;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "accountByCustomerId")
    private Collection<CartDetail> cartDetailsById;
    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<CustomerVoucher> customerVouchersById;
    @OneToMany(mappedBy = "accountByCustomerId")
    private Collection<Orders> ordersById;
    @OneToMany(mappedBy = "accountByStaffId")
    private Collection<Orders> ordersById_0;
    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<RoleAccount> roleAccountsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(email, account.email) && Objects.equals(address, account.address) && Objects.equals(phoneNumber, account.phoneNumber) && Objects.equals(status, account.status) && Objects.equals(salary, account.salary) && Objects.equals(dateOfBirth, account.dateOfBirth) && Objects.equals(name, account.name) && Objects.equals(hireDate, account.hireDate) && Objects.equals(notes, account.notes) && Objects.equals(gender, account.gender) && Objects.equals(createdAt, account.createdAt) && Objects.equals(updatedAt, account.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, address, phoneNumber, status, salary, dateOfBirth, name, hireDate, notes, gender, createdAt, updatedAt);
    }

    public Collection<CartDetail> getCartDetailsById() {
        return cartDetailsById;
    }

    public void setCartDetailsById(Collection<CartDetail> cartDetailsById) {
        this.cartDetailsById = cartDetailsById;
    }

    public Collection<CustomerVoucher> getCustomerVouchersById() {
        return customerVouchersById;
    }

    public void setCustomerVouchersById(Collection<CustomerVoucher> customerVouchersById) {
        this.customerVouchersById = customerVouchersById;
    }

    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }

    public Collection<Orders> getOrdersById_0() {
        return ordersById_0;
    }

    public void setOrdersById_0(Collection<Orders> ordersById_0) {
        this.ordersById_0 = ordersById_0;
    }

    public Collection<RoleAccount> getRoleAccountsById() {
        return roleAccountsById;
    }

    public void setRoleAccountsById(Collection<RoleAccount> roleAccountsById) {
        this.roleAccountsById = roleAccountsById;
    }
}
