package br.com.fei.hotel.common.service;

import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ComboboxVO;

public interface QuartoService
{
	Structure<ComboboxVO> getQuartosCombobox() throws Exception;
}