/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.business.facade;

import com.yankee.facade.local.LevelFacadeLocal;
import com.yankee.facade.remote.LevelInterfazRemote;
import com.yankee.model.Level;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;

/**
 *
 * @author syslife03
 */
@Stateless(name = "levelInterfazRemote", mappedName = LevelInterfazRemote.JNDI_REMOTE_NAME)
@Remote(LevelInterfazRemote.class)
public class LevelBusinessFacade implements LevelInterfazRemote{

    @EJB
    LevelFacadeLocal levelfacadelocal;
    
    @Override
    public Level create(Level level) {
       
        levelfacadelocal.create(level);
        return level;

    }

    @Override
    public Level edit(Level level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Level level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Level find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Level> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Level> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
