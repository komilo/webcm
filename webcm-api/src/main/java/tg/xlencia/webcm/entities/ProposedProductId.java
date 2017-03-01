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
public class ProposedProductId implements Serializable {
    
    @Column(name = "visit_id", nullable = false)
    private Long visitId;
    
    @Column(name = "product_id", nullable = false)
    private Long productId;

    public ProposedProductId() {
    }

    public ProposedProductId(Long visitId, Long productId) {
        this.visitId = visitId;
        this.productId = productId;
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.visitId);
        hash = 53 * hash + Objects.hashCode(this.productId);
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
        final ProposedProductId other = (ProposedProductId) obj;
        if (!Objects.equals(this.visitId, other.visitId)) {
            return false;
        }
        return Objects.equals(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "ProposedProductId{" + "visitId=" + visitId + ", productId=" + productId + '}';
    }
}
