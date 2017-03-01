/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.service;

import javax.ejb.Remote;
import tg.komilo.kore.service.GenericServiceBeanRemote;
import tg.xlencia.webcm.entities.Country;

/**
 *
 * @author komilo
 */
@Remote
public interface CountryServiceBeanRemote extends GenericServiceBeanRemote<Country, Integer>{
    
}
