/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author komilo
 */
@Embeddable
public class ProductKitProductId implements Serializable {
    
    @Column(name = "kit_id", nullable = false)
    private Long kitId;
    
    @Column(name = "product_id", nullable = false)
    private Long productId;

    public ProductKitProductId() {
    }

    public ProductKitProductId(Long kitId, Long productId) {
        this.kitId = kitId;
        this.productId = productId;
    }

    public Long getKitId() {
        return kitId;
    }

    public void setKitId(Long kitId) {
        this.kitId = kitId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.kitId);
        hash = 29 * hash + Objects.hashCode(this.productId);
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
        final ProductKitProductId other = (ProductKitProductId) obj;
        if (!Objects.equals(this.kitId, other.kitId)) {
            return false;
        }
        return Objects.equals(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "ProductKitProductId{" + "kitId=" + kitId + ", productId=" + productId + '}';
    }
}
