package br.com.fei.hotel.common.utils.structure.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import br.com.fei.hotel.common.utils.ConstantDataManager;
import br.com.fei.hotel.common.utils.exceptions.NotInitializedStructureException;
import br.com.fei.hotel.common.utils.structure.Structure;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SequentialStaticListImpl<E> implements Structure<E>
{
	private E[] array;
	private int size;
	private int n;
	
	@SuppressWarnings("unchecked")
	public SequentialStaticListImpl(final int size)
	{
		array = (E[]) new Object[size];
		this.size = size;
		n = -1;
	}
	
	public final boolean add(final E element)
	{
		if(!isFull())
		{
			n++;
			array[n] = element;
			return true;
		}
		
		return false;
	}

	public final E find(int index)
	{
		E result = null;
		if(isValidIndex(index))
		{
			result = array[index];
		}
		
		if(result == null)
		{
			throw new NoSuchElementException(ConstantDataManager.ELEMENTO_NAO_ENCONTRADO);
		}
		
		return result;
	}

	public final E find(final E element)
	{
		E result = null;
		for(final E item : array)
		{
			if(item == element)
			{
				result = item;
			}
		}
		
		if(result == null)
		{
			throw new NoSuchElementException(ConstantDataManager.ELEMENTO_NAO_ENCONTRADO);
		}
		
		return result;
	}

	public boolean remove(final int index)
	{
		boolean result = false;;
		
		if(isInitialized())
		{
			if(isValidIndex(index))
			{
				int numberElements = n - index;
				if (numberElements > 0)
				{
					System.arraycopy(array, index + 1, array, index, numberElements);
				} 
				n--;
				result = true;
			}
		}
		else
		{
			throw new NoSuchElementException(ConstantDataManager.ELEMENTO_NAO_ENCONTRADO);
		}
		return result;
	}

	public final boolean remove(final E element)
	{
		throw new NotImplementedException();
	}

	public final int getSize()
	{
		return this.array.length;
	}
	
	public final int getMaxSize()
	{
		return this.size;
	}
	
	public Iterator<E> iterator()
	{
		return new SequentialStaticListIterator();
	}
	
	private final boolean isInitialized()
	{
		if(this.array.length == 0)
		{
			throw new NotInitializedStructureException(ConstantDataManager.ESTRUTURA_NAO_INICIALIZADA);
		}
		else
		{
			return true;
		}
	}
	
	private final boolean isFull()
	{
		if(array[size-1] != null)
		{
			throw new IndexOutOfBoundsException(ConstantDataManager.ESTRUTURA_CHEIA);
		}
		else
		{
			return false;
		}
	}
	
	private final boolean isValidIndex(final int index)
	{
		if(index < 0 || index > size-1)
		{
			throw new NoSuchElementException(ConstantDataManager.INDICE_INVALIDO);
		}
		else
		{
			return true;
		}
	}
	
	public class SequentialStaticListIterator implements Iterator<E>
	{
		private int currentIndex = 0;
		private int length;
		
		public SequentialStaticListIterator()
		{
			this.length = SequentialStaticListImpl.this.array.length;
		}
		
		public final boolean hasNext()
		{
			if(currentIndex > length)
			{
				return SequentialStaticListImpl.this.array[currentIndex] != null;
			}
			else
			{
				return false;
			}
		}

		public final E next()
		{
			final E result = SequentialStaticListImpl.this.array[currentIndex];
			currentIndex++;
			return result;
		}
		
	}
}
