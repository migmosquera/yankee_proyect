/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.facade.local;

import com.yankee.model.Board;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author syslife01
 */
@Local
public interface BoardFacadeLocal {

    void create(Board board);

    void edit(Board board);

    void remove(Board board);

    Board find(Object id);

    List<Board> findAll();

    List<Board> findRange(int[] range);

    int count();
    
}
