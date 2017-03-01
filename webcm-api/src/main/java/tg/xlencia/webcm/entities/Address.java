/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "webcm_addresses")
public class Address extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "phone1", nullable = false, length = 32)
    private String phone1;
    
    @Column(name = "phone2", nullable = true, length = 32)
    private String phone2;
    
    @Column(name = "fax", nullable = true, length = 32)
    private String fax;
    
    @Column(name = "email", nullable = true, length = 64)
    private String email;
    
    @Column(name = "po_box", nullable = true, length = 64)
    private String poBox;
    
    @Column(name = "misc", nullable = true, length = 512)
    private String misc;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = true)
    private City city;

    public Address() {
    }

    public Address(String phone1, String phone2, String fax, String email, String poBox, String misc) {
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.fax = fax;
        this.email = email;
        this.poBox = poBox;
        this.misc = misc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax=" + fax + ", email=" + email + ", poBox=" + poBox + ", misc=" + misc + ", city=" + city + '}';
    }
}
