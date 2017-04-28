/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.facade.remote;

import com.yankee.model.Board;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author syslife01
 */
@Remote
public interface BoardInterfazRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/boardInterfazRemote";
    
    void create(Board board);

    void edit(Board board);

    void remove(Board board);

    Board find(Object id);

    List<Board> findAll();

    List<Board> findRange(int[] range);

    int count();
}
