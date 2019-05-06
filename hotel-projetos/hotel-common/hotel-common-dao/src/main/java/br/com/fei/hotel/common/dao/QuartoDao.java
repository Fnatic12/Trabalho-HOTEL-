package br.com.fei.hotel.common.dao;

import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ComboboxVO;

public interface QuartoDao
{
	Structure<ComboboxVO> getQuartosCombobox() throws Exception;
}