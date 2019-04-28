/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fei.hotel.common.utils.structures.impl;

import br.com.fei.hotel.common.utils.structures.Structure;
import java.io.Serializable;

/**
 *
 * @author vitor
 * @param <E>
 */
public class ResizableArray<E extends Object> implements Structure<E>, Serializable
{
    private transient Object[] e;
    private int size = 10;
    
    public ResizableArray()
    {
        this.e = new Object[size];
    }
    
    public int add(E element)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E findByIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E findeByElement(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
