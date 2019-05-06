package br.edu.fei.hotel.common.model;

import java.io.Serializable;

public final class ClienteVO implements Serializable
{
	private static final long serialVersionUID = 2523887190846437579L;
	
	private long codigo;
	private String nome;
	private String dataNascimento;
	private final DadosContato dadosContato = new DadosContato();
	private final DadosDocumentos dadosDocumentos = new DadosDocumentos();
	private final DadosEndereco dadosEndereco = new DadosEndereco();
	
	public ClienteVO()
	{
		
	}

	public final long getCodigo()
	{
		return this.codigo;
	}

	public final void setCodigo(final long codigo)
	{
		this.codigo = codigo;
	}

	public final String getNome()
	{
		return this.nome;
	}

	public final void setNome(final String nome)
	{
		this.nome = nome;
	}

	public final String getDataNascimento()
	{
		return this.dataNascimento;
	}

	public final void setDataNascimento(final String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	public final DadosContato getDadosContato()
	{
		return this.dadosContato;
	}

	public final DadosDocumentos getDadosDocumentos()
	{
		return this.dadosDocumentos;
	}

	public final DadosEndereco getDadosEndereco()
	{
		return this.dadosEndereco;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		else
		{
			if(this.getClass() != obj.getClass())
			{
				return false;
			}
			else
			{
				final ClienteVO cli = (ClienteVO) obj;
				if(cli.getNome().equalsIgnoreCase(this.nome))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
	}
}