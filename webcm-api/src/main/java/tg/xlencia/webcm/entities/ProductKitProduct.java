/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "webcm_product_kits_products")
public class ProductKitProduct extends BaseEntity {
    
    @EmbeddedId
    private ProductKitProductId id;
    
    @Column(name = "quantity", nullable = false)
    private int quantity;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kit_id", nullable = false, insertable = false, updatable = false)
    private ProductKit kit;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    private Product product;

    public ProductKitProduct() {
    }

    public ProductKitProduct(int quantity) {
        this.quantity = quantity;
    }

    public ProductKitProductId getId() {
        return id;
    }

    public void setId(ProductKitProductId id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductKit getKit() {
        return kit;
    }

    public void setKit(ProductKit kit) {
        this.kit = kit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final ProductKitProduct other = (ProductKitProduct) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductKitProduct{" + "id=" + id + ", quantity=" + quantity + ", kit=" + kit + ", product=" + product + '}';
    }
}
