package br.edu.fei.hotel.common.model;

import java.io.Serializable;

/**
 *
 * @author vitor
 */
public class DadosDocumentos implements Serializable
{
	private static final long serialVersionUID = -7913565738029985626L;
	
	private String cpf;
    private String rg;
    
    public DadosDocumentos()
    {
        super();
    }

    public final String getCpf()
    {
        return this.cpf;
    }

    public final void setCpf(final String cpf)
    {
        this.cpf = cpf;
    }

    public final String getRg()
    {
        return this.rg;
    }

    public final void setRg(final String rg)
    {
        this.rg = rg;
    }
}