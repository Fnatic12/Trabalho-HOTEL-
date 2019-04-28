package br.edu.fei.hotel.common.model;

import java.io.Serializable;

/**
 *
 * @author vitor
 */
public class DadosAlteracao implements Serializable
{
    private long codigoUsuarioCriacao;
    private String usuarioCriacao;
    private String dataCriacao;
    private long codigoUsuarioAlteracao;
    private String usuarioAlteracao;
    private String dataAlteracao;
    
    public DadosAlteracao()
    {
        super();
    }

    public final long getCodigoUsuarioCriacao()
    {
        return this.codigoUsuarioCriacao;
    }

    public final void setCodigoUsuarioCriacao(final long codigoUsuarioCriacao)
    {
        this.codigoUsuarioCriacao = codigoUsuarioCriacao;
    }

    public final String getUsuarioCriacao()
    {
        return this.usuarioCriacao;
    }

    public final void setUsuarioCriacao(final String usuarioCriacao)
    {
        this.usuarioCriacao = usuarioCriacao;
    }

    public final String getDataCriacao()
    {
        return this.dataCriacao;
    }

    public final void setDataCriacao(final String dataCriacao)
    {
        this.dataCriacao = dataCriacao;
    }

    public final long getCodigoUsuarioAlteracao()
    {
        return this.codigoUsuarioAlteracao;
    }

    public final void setCodigoUsuarioAlteracao(final long codigoUsuarioAlteracao)
    {
        this.codigoUsuarioAlteracao = codigoUsuarioAlteracao;
    }

    public final String getUsuarioAlteracao()
    {
        return this.usuarioAlteracao;
    }

    public final void setUsuarioAlteracao(final String usuarioAlteracao)
    {
        this.usuarioAlteracao = usuarioAlteracao;
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