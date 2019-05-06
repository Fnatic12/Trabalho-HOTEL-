package br.edu.fei.hotel.common.model;

import java.io.Serializable;

public class ComboboxVO implements Serializable
{
	private static final long serialVersionUID = 3375491605976567755L;
	
	private String key;
	private String value;
	
	public ComboboxVO()
	{
		super();
	}
	
	public final String getKey()
	{
		return this.key;
	}
	
	public final void setKey(final String key)
	{
		this.key = key;
	}
	
	public final String getValue()
	{
		return this.value;
	}
	
	public final void setValue(final String value)
	{
		this.value = value;
	}
}