package br.edu.fei.hotel.common.model;

import java.io.Serializable;

/**
 *
 * @author vitor
 */
public class DadosAlteracao implements Serializable
{
	private static final long serialVersionUID = 3836287786664717761L;
	
    private String dataCriacao;
    private String dataAlteracao;
    
    public DadosAlteracao()
    {
        super();
    }

    public final String getDataCriacao()
    {
        return this.dataCriacao;
    }

    public final void setDataCriacao(final String dataCriacao)
    {
        this.dataCriacao = dataCriacao;
    }

    public final String getDataAlteracao()
    {
        return this.dataAlteracao;
    }

    public final void setDataAlteracao(final String dataAlteracao)
    {
        this.dataAlteracao = dataAlteracao;
    }
}