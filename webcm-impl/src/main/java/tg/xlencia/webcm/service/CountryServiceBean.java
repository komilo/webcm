/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.komilo.kore.dao.GenericDAOBeanLocal;
import tg.komilo.kore.service.GenericServiceBean;
import tg.xlencia.webcm.dao.CountryDAOBeanLocal;
import tg.xlencia.webcm.entities.Country;

/**
 *
 * @author komilo
 */
@Stateless
public class CountryServiceBean extends GenericServiceBean<Country, Integer> 
        implements CountryServiceBeanRemote {
    
    @EJB
    private CountryDAOBeanLocal dao;

    @Override
    protected GenericDAOBeanLocal<Country, Integer> getDAO() {
        return this.dao;
    }

    @Override
    public Integer getId(Country e) {
        return e.getId();
    }
}
