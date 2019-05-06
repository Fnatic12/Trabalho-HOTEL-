package br.com.fei.hotel.common.utils.structure;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fei.hotel.common.utils.structure.impl.DoublyLinkedListImpl;

public class DoublyLinkedListTest 
{
	private Structure<Integer> testList;
	
	@Before
	public void setup() throws Exception
	{
		this.testList = new DoublyLinkedListImpl<Integer>();
		this.testList.add(22);
		this.testList.add(25);
		this.testList.add(64);
		this.testList.add(45);
	}
	
	@Test
	public void isNotEmpty()
	{
		Assert.assertTrue(this.testList.getSize() > 0);
	}
	
	@Test
	public void findByElement() throws Exception
	{
		final int element = 64;
		final int result = this.testList.find((Integer) element);
		
		Assert.assertTrue(element == result);
	}
	
	@Test
	public void findByIndex() throws Exception
	{
		final int index = 2;
		final int result = this.testList.find(index);
		
		Assert.assertTrue(64 == result);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void removeByElement() throws Exception
	{
		final int element = 64;
		this.testList.remove((Integer) element);
		this.testList.find(element);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void removeByIndex() throws Exception
	{
		final int index = 2;
		this.testList.remove(index);
		this.testList.find(index);
	}
	
	@Test
	public void forEach()
	{
		for(final int i : this.testList)
		{
			System.out.println(i);
		}
	}
	
	@After
	public void finalize()
	{
		if(this.testList != null)
		{
			this.testList = null;
		}
	}
}