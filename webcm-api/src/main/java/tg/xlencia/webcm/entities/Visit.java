/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table("webcm_visits")
public class Visit extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "visit_date", nullable = false)
    private Date visitDate;
    
    @OneToMany(mappedBy = "visit", fetch = FetchType.LAZY)
    private List<ProposedProduct> proposedProducts = new LinkedList<>();

    public Visit() {
    }

    public Visit(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public List<ProposedProduct> getProposedProducts() {
        return proposedProducts;
    }

    public void setProposedProducts(List<ProposedProduct> proposedProducts) {
        this.proposedProducts = proposedProducts;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Visit other = (Visit) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Visit{" + "id=" + id + ", visitDate=" + visitDate + '}';
    }
}
