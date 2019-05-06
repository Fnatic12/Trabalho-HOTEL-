package br.com.fei.hotel.common.utils.structure.impl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

import br.com.fei.hotel.common.utils.ConstantDataManager;
import br.com.fei.hotel.common.utils.exceptions.NotInitializedStructureException;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.com.fei.hotel.common.utils.structure.iterators.LinkedList;
import br.com.fei.hotel.common.utils.structure.iterators.impl.LinkedListIteratorImpl;

public class DoublyLinkedListImpl<E> implements Structure<E>, LinkedList<E>, Serializable
{
	private static final long serialVersionUID = -3450394170393815878L;
	
	private Node head;
	private Node tail;
	private int size = 0;

	public final boolean add(final E element)
	{
		boolean result;
		
		final Node node = new Node(size, element, null, null);
		
		if(this.head == null)
		{
			this.head = node;
			this.tail = node;
		}
		else
		{
			node.setLeft(this.tail);
			node.setRight(null);
			this.tail.setRight(node);
			this.tail = node;
		}
		size++;
		result = true;
		
		return result;
	}

	public final E find(final int index)
	{
		E result = null;
		if(isInitialized())
		{
			Node node = this.head;
			
			while(node != null)
			{
				final int nodeIndex = node.getIndex();
				if(nodeIndex == index)
				{
					return node.getData();
				}
				
				if(node.getRight() != null)
				{
					node = node.getRight();
				}
				else
				{
					throw new NoSuchElementException(ConstantDataManager.ELEMENTO_NAO_ENCONTRADO);
				}
			}
		}
		
		return result;
	}

	public final E find(final E element)
	{
		E result = null;
		if(isInitialized())
		{
			Node node = this.head;
			
			while(node != null)
			{
				final E nodeData = node.getData();
				if(nodeData.equals(element))
				{
					return nodeData;
				}
				
				if(node.getRight() != null)
				{
					node = node.getRight();
				}
				else
				{
					throw new NoSuchElementException(ConstantDataManager.ELEMENTO_NAO_ENCONTRADO);
				}
			}
		}
		return result;
	}

	public final boolean remove(final int index)
	{
		boolean result = false;
		if(isInitialized())
		{
			Node node = this.head;
			while(node != null)
			{
				if(node.getIndex() == index)
				{
					if(node.getLeft() == null)
					{
						this.head = node.getRight();
						node.getRight().setLeft(null);
					}
					else
					{
						node.getLeft().setRight(node.getRight());
						node.getRight().setLeft(node.getLeft());
					}
				}
				
				node = node.getRight();
				result = true;
			}
		}
		size--;
		return result;
	}

	public final boolean remove(final E element)
	{
		boolean result = false;
		if(isInitialized())
		{
			Node node = this.head;
			while(node != null)
			{
				if(node.getData() == element)
				{
					if(node.getLeft() == null)
					{
						this.head = node.getRight();
						node.getRight().setLeft(null);
					}
					else
					{
						node.getLeft().setRight(node.getRight());
						node.getRight().setLeft(node.getLeft());
					}
				}
				
				node = node.getRight();
			}
			result = true;
		}
		size--;
		return result;
	}

	public int getSize()
	{
		return this.size;
	}
	
	public final Iterator<E> iterator()
	{
		return new LinkedListIteratorImpl<E>(this);
	}
	
	public final br.com.fei.hotel.common.utils.structure.iterators.Node<E> getHead()
	{
		return this.head;
	}
	
	private boolean isInitialized()
	{
		if(this.head == null)
		{
			throw new NotInitializedStructureException(ConstantDataManager.ESTRUTURA_NAO_INICIALIZADA);
		}
		
		return true;
	}
	
	public class Node implements br.com.fei.hotel.common.utils.structure.iterators.Node<E>, Serializable
	{
		private static final long serialVersionUID = -4849852070339854379L;
		
		private int index;
		private E data;
		private Node left;
		private Node right;
		
		public Node(int index, E data, Node left, Node right)
		{
			this.index = index;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public int getIndex()
		{
			return this.index;
		}
		
		public void setIndex(final int index)
		{
			this.index = index;
		}
		
		public final E getData()
		{
			return this.data;
		}
		
		public final void setData(final E data)
		{
			this.data = data;
		}
		
		public final Node getLeft()
		{
			return this.left;
		}
		
		public final void setLeft(final Node left)
		{
			this.left = left;
		}
		
		public final Node getRight()
		{
			return this.right;
		}
		
		public final void setRight(final Node right)
		{
			this.right = right;
		}
	}
}