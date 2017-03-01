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
public class RecruitingId implements Serializable {
    
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;
    
    @Column(name = "post_id", nullable = false)
    private Integer postId;

    public RecruitingId() {
    }

    public RecruitingId(Long employeeId, Integer postId) {
        this.employeeId = employeeId;
        this.postId = postId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.employeeId);
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
        final RecruitingId other = (RecruitingId) obj;
        return Objects.equals(this.employeeId, other.employeeId);
    }

    @Override
    public String toString() {
        return "RecruitingId{" + "employeeId=" + employeeId + ", postId=" + postId + '}';
    }
}
