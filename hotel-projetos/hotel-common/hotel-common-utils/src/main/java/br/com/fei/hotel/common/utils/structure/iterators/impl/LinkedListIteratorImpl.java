package br.com.fei.hotel.common.utils.structure.iterators.impl;

import java.util.Iterator;

import br.com.fei.hotel.common.utils.structure.iterators.Node;
import br.com.fei.hotel.common.utils.structure.iterators.LinkedList;

public class LinkedListIteratorImpl<E> implements Iterator<E>
{
	private Node<E> current;
	
	public LinkedListIteratorImpl(final LinkedList<E> list)
	{
		super();
		current = list.getHead();
	}
	
	public final boolean hasNext()
	{
		return current != null;
	}

	public E next()
	{
		E element = current.getData();
		current = current.getRight();
		return element;
	}
}