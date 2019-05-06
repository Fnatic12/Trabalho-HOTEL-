package br.com.fei.hotel.common.utils.structure;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fei.hotel.common.utils.structure.impl.SequentialStaticListImpl;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SequentialStaticListTest
{
	private Structure<Long> testList;
	
	@Before
	public void setup() throws Exception
	{
		this.testList = new SequentialStaticListImpl<Long>(10);
		this.testList.add(22L);
		this.testList.add(25L);
		this.testList.add(64L);
		this.testList.add(45L);
	}
	
	@Test
	public void isNotEmpty()
	{
		Assert.assertTrue(this.testList.getSize() > 0);
	}
	
	@Test
	public void findByElement() throws Exception
	{
		final long element = 64;
		final long result = this.testList.find(element);
		
		Assert.assertTrue(element == result);
	}
	
	@Test
	public void findByIndex() throws Exception
	{
		final int index = 2;
		final long result = this.testList.find(index);
		
		Assert.assertTrue(64 == result);
	}
	
	@Test(expected = NotImplementedException.class)
	public void removeByElement() throws Exception
	{
		this.testList.remove(64L);
	}
	
	@Test
	public void removeByIndex() throws Exception
	{
		final int index = 2;
		this.testList.remove(index);
		Assert.assertTrue(64 != this.testList.find(2));
	}
	
	@Test
	public void forEach()
	{
		for(final long i : this.testList)
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