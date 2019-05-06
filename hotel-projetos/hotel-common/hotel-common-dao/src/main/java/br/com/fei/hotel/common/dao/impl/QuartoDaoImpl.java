package br.com.fei.hotel.common.dao.impl;

import br.com.fei.hotel.common.dao.QuartoDao;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.com.fei.hotel.common.utils.structure.impl.SequentialStaticListImpl;
import br.edu.fei.hotel.common.model.ComboboxVO;

public class QuartoDaoImpl implements QuartoDao
{
	public Structure<ComboboxVO> getQuartosCombobox() throws Exception
	{
		final Structure<ComboboxVO> list = new SequentialStaticListImpl<ComboboxVO>(5);
		
		final ComboboxVO quartoSimples = new ComboboxVO();
		quartoSimples.setKey("1");
		quartoSimples.setValue("Quarto Simples");
		
		final ComboboxVO quartoLuxo = new ComboboxVO();
		quartoLuxo.setKey("2");
		quartoLuxo.setValue("Quarto Luxo");
		
		final ComboboxVO quartoPresidencial = new ComboboxVO();
		quartoPresidencial.setKey("3");
		quartoPresidencial.setValue("Quarto Presidencial");
		
		list.add(quartoSimples);
		list.add(quartoLuxo);
		list.add(quartoPresidencial);
		
		return list;
	}
}