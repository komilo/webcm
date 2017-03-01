/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.entities;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author komilo
 */
@Entity
@DiscriminatorValue("K")
public class ProductKit extends Product {
    
    @Column(name = "discount", nullable = true)
    private double discount;
    
    @OneToMany(mappedBy = "kit", fetch = FetchType.EAGER)
    private List<ProductKitProduct> kitProducts = new LinkedList<>();

    public ProductKit() {
        super();
        this.discount = 0.;
    }

    public ProductKit(double discount, String code, String label) {
        super(code, label);
        this.discount = discount;
    }
    
    public double getDefaultUnitPrice() {
        double unitPrice = 0.;
        for (ProductKitProduct kitProduct : this.kitProducts) {
            unitPrice += kitProduct.getQuantity() * kitProduct.getProduct().getUnitPrice();
        }
        return unitPrice;
    }

    @Override
    public double getUnitPrice() {
        return this.getDefaultUnitPrice() - this.discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<ProductKitProduct> getKitProducts() {
        return kitProducts;
    }

    public void setKitProducts(List<ProductKitProduct> kitProducts) {
        this.kitProducts = kitProducts;
    }
}
