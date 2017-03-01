/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "webcm_prospection_states")
public class ProspectionState extends BaseEntity {
    
    @Id
    @Column(name = "code", nullable = false, length = 2)
    private String code;
    
    @Column(name = "label", nullable = false, length = 32)
    private String label;

    public ProspectionState() {
    }

    public ProspectionState(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.code);
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
        final ProspectionState other = (ProspectionState) obj;
        return Objects.equals(this.code, other.code);
    }

    @Override
    public String toString() {
        return "ProspectionState{" + "code=" + code + ", label=" + label + '}';
    }
}
