/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.facade.remote;

import com.yankee.model.User;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author syslife01
 */
@Remote
public interface UserInterfazRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/userInterfazRemote";
    
    void create(User user);

    void edit(User user);

    void remove(User user);

    User find(Object id);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();
}
