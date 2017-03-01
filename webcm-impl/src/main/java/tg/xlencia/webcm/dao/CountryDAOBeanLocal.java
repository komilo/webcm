/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.dao;

import javax.ejb.Local;
import tg.komilo.kore.dao.GenericDAOBeanLocal;
import tg.xlencia.webcm.entities.Country;

/**
 *
 * @author komilo
 */
@Local
public interface CountryDAOBeanLocal extends GenericDAOBeanLocal<Country, Integer> {
    
}
