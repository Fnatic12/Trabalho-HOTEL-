package br.com.fei.hotel.common.utils.exceptions;

public class NotInitializedStructureException extends RuntimeException
{
	private static final long serialVersionUID = -4176117047604137363L;
	
	public NotInitializedStructureException(final String message)
	{
		super(message);
	}
}
