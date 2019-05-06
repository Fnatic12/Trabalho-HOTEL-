package br.edu.fei.hotel.common.model;

import java.io.Serializable;

public class DadosEndereco implements Serializable
{
	private static final long serialVersionUID = 2994744692742294148L;
	
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;
	
	public DadosEndereco()
	{
		super();
	}

	public final String getEndereco()
	{
		return this.endereco;
	}

	public final void setEndereco(final String endereco)
	{
		this.endereco = endereco;
	}

	public final String getBairro()
	{
		return this.bairro;
	}

	public final void setBairro(final String bairro)
	{
		this.bairro = bairro;
	}

	public final String getCep()
	{
		return this.cep;
	}

	public final void setCep(final String cep)
	{
		this.cep = cep;
	}

	public final String getCidade()
	{
		return this.cidade;
	}

	public final void setCidade(final String cidade)
	{
		this.cidade = cidade;
	}

	public final String getEstado()
	{
		return this.estado;
	}

	public final void setEstado(final String estado)
	{
		this.estado = estado;
	}

	public final String getPais()
	{
		return this.pais;
	}

	public final void setPais(final String pais)
	{
		this.pais = pais;
	}
}