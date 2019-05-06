package br.edu.fei.hotel.common.model;

import java.io.Serializable;

import br.com.fei.hotel.common.utils.structure.Structure;
import br.com.fei.hotel.common.utils.structure.impl.DoublyLinkedListImpl;

/**
 *
 * @author vitor
 */
public class DadosContato implements Serializable
{
	private static final long serialVersionUID = -1263689613327355287L;
	
	private String email;
    private String telefone;
    private String celular;
    
    public DadosContato()
    {
    	super();
	}
    
    public final String getEmail()
    {
		return this.email;
	}
    
    public final void setEmail(final String email)
    {
		this.email = email;
	}
    
    public final String getTelefone()
    {
		return this.telefone;
	}
    
    public final void setTelefone(final String telefone)
    {
		this.telefone = telefone;
	}
    
    public final String getCelular()
    {
		return this.celular;
	}
    
    public final void setCelular(final String celular)
    {
		this.celular = celular;
	}
}