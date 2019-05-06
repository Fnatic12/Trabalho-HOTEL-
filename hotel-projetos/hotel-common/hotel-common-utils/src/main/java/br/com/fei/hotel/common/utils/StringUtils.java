package br.com.fei.hotel.common.utils;

public final class StringUtils
{
	private StringUtils()
	{
		//
	}
	
	public static boolean isNull(final String value)
	{
		boolean result;
		if(value == null)
		{
			result = false;
		}
		else
		{
			final char[] valueArray = value.toCharArray();
			if(valueArray.length == 0)
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}
		
		return result;
	}
	
	public static boolean isLong(final String value)
	{
		boolean result;
		
		if(isNull(value))
		{
			result = false;
		}
		else
		{
			try
			{
				Long.valueOf(value);
				result = true;
			}
			catch(final Exception e)
			{
				result = false;
			}
		}
		
		return result;
	}
	
	public static boolean isDouble(final String value)
	{
		boolean result;
		
		if(isNull(value))
		{
			result = false;
		}
		else
		{
			try
			{
				Double.valueOf(value);
				result = true;
			}
			catch(final Exception e)
			{
				result = false;
			}
		}
		
		return result;
	}
}