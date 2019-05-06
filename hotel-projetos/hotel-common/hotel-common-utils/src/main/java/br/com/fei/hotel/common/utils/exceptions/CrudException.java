package br.com.fei.hotel.common.utils.exceptions;

public final class CrudException extends RuntimeException
{
	private static final long serialVersionUID = 8502373519582899602L;

	public CrudException(final String message)
	{
        super(message);
    }
}