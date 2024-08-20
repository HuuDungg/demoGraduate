package com.example.demograduate.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Role {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @OneToMany(mappedBy = "roleByRoleId")
    private Collection<RoleAccount> roleAccountsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(name, role.name) && Objects.equals(status, role.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }

    public Collection<RoleAccount> getRoleAccountsById() {
        return roleAccountsById;
    }

    public void setRoleAccountsById(Collection<RoleAccount> roleAccountsById) {
        this.roleAccountsById = roleAccountsById;
    }
}
