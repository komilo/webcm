/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.xlencia.webcm.web.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import tg.komilo.kore.web.beans.BaseApplicationBean;

/**
 *
 * @author komilo
 */
@ManagedBean
@ApplicationScoped
public class ApplicationBean extends BaseApplicationBean {
    
    public static final String MENU_FILE_PATH = "/webcm/templates/menu.xhtml";
    public static final String SECONDARY_MENU_FILE_PATH = "/webcm/templates/secondary-menu.xhtml";

    @Override
    public String getApplicationName() {
        return "webcm";
    }

    @Override
    public String getApplicationDisplayName() {
        return "WebCM";
    }

    @Override
    public String getApplicationSlogan() {
        return "WebCM Slogan!";
    }

    @Override
    public String getMenuFilePath() {
        return MENU_FILE_PATH;
    }

    @Override
    public String getSecondaryMenuFilePath() {
        return SECONDARY_MENU_FILE_PATH;
    }
    
}
