/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author komilo
 */
@Entity
@DiscriminatorValue("S")
public class SimpleProduct extends Product {
    
    @Column(name = "unit_price", nullable = true)
    private double unitPrice;    

    public SimpleProduct() {
        super();
        this.unitPrice = 0.;
    }

    public SimpleProduct(double unitPrice, String code, String label) {
        super(code, label);
        this.unitPrice = unitPrice;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
