/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yankee.facade.local;

import com.yankee.model.Board;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author syslife01
 */
@Stateless
public class BoardFacade extends AbstractFacade<Board> implements BoardFacadeLocal {

    @PersistenceContext(unitName = "yankee_bd_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BoardFacade() {
        super(Board.class);
    }
    
}
