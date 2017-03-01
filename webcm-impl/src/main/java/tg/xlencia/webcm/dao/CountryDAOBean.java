/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.dao;

import javax.ejb.Stateless;
import tg.komilo.kore.dao.GenericDAOBean;
import tg.xlencia.webcm.entities.Country;

/**
 *
 * @author komilo
 */
@Stateless
public class CountryDAOBean extends GenericDAOBean<Country, Integer> implements CountryDAOBeanLocal {
    
    public CountryDAOBean() {
        super(Country.class);
    }
}
