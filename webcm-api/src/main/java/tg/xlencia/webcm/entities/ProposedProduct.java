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
@Table(name = "webcm_proposed_products")
public class ProposedProduct extends BaseEntity {
    
    @EmbeddedId
    private ProposedProductId id;
    
    @Column(name = "known", nullable = false)
    private boolean known;
    
    @Column(name = "comment", nullable = true)
    private String comment;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visit_id", nullable = false, insertable = false, updatable = false)
    private Visit visit;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    private Product product;

    public ProposedProduct() {
        this.known = false;
    }

    public ProposedProduct(boolean known, String comment) {
        this.known = known;
        this.comment = comment;
    }

    public ProposedProduct(boolean known, String comment, Visit visit, Product product) {
        this.known = known;
        this.comment = comment;
        this.visit = visit;
        this.product = product;
    }

    public ProposedProductId getId() {
        return id;
    }

    public void setId(ProposedProductId id) {
        this.id = id;
    }

    public boolean isKnown() {
        return known;
    }

    public void setKnown(boolean known) {
        this.known = known;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final ProposedProduct other = (ProposedProduct) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ProposedProduct{" + "id=" + id + ", known=" + known + ", comment=" + comment + ", visit=" + visit + ", product=" + product + '}';
    }
}
