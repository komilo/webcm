/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "webcm_countries")
public class Country extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "phone_code", nullable = true)
    private Integer phoneCode;
    
    @Column(name = "label", nullable = false, length = 128)
    private String label;
    
    @Column(name = "nationality_label", nullable = false, length = 128)
    private String nationalityLabel;

    public Country() {
    }

    public Country(Integer phoneCode, String label, String nationalityLabel) {
        this.phoneCode = phoneCode;
        this.label = label;
        this.nationalityLabel = nationalityLabel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNationalityLabel() {
        return nationalityLabel;
    }

    public void setNationalityLabel(String nationalityLabel) {
        this.nationalityLabel = nationalityLabel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Country other = (Country) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", phoneCode=" + phoneCode + ", label=" + label + ", nationalityLabel=" + nationalityLabel + '}';
    }
}
