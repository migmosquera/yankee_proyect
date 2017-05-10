/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.facade.remote;

import com.yankee.model.Level;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author syslife03
 */
@Remote
public interface LevelInterfazRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/levelInterfazRemote";
    
    Level create(Level level);

    Level edit(Level level);

    void remove(Level level);

    Level find(Object id);

    List<Level> findAll();

    List<Level> findRange(int[] range);

    int count();
}
