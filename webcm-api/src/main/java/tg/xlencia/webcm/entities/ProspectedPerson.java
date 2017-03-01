/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import tg.komilo.kore.entities.BaseEntity;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "webcm_prospected_persons")
public class ProspectedPerson extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_field_id", nullable = false)
    private ActivityField activityField;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_code", nullable = false)
    private ProspectionState state;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_code", nullable = false)
    private PersonType personType;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "prospected_person_id", nullable = true)
    private List<Address> addresses = new LinkedList<>();
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "institution_id", nullable = true)
    private List<ProspectedPerson> contacts = new LinkedList<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;

    public ProspectedPerson() {
    }

    public ProspectedPerson(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivityField getActivityField() {
        return activityField;
    }

    public void setActivityField(ActivityField activityField) {
        this.activityField = activityField;
    }

    public ProspectionState getState() {
        return state;
    }

    public void setState(ProspectionState state) {
        this.state = state;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<ProspectedPerson> getContacts() {
        return contacts;
    }

    public void setContacts(List<ProspectedPerson> contacts) {
        this.contacts = contacts;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final ProspectedPerson other = (ProspectedPerson) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ProspectedPerson{" + "id=" + id + ", name=" + name + ", activityField=" + activityField + ", addresses=" + addresses + ", contacts=" + contacts + '}';
    }
}
