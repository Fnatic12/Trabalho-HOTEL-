package br.edu.fei.hotel.common.model;

import java.io.Serializable;

/**
 *
 * @author vitor
 */
public class DadosDocumentos implements Serializable
{
    private long cpf;
    private long rg;
    
    private DadosDocumentos()
    {
        super();
    }

    public final long getCpf()
    {
        return this.cpf;
    }

    public final void setCpf(final long cpf)
    {
        this.cpf = cpf;
    }

    public final long getRg()
    {
        return this.rg;
    }

    public final void setRg(final long rg)
    {
        this.rg = rg;
    }
}