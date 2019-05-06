package br.com.fei.hotel.common.service;

import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ClienteVO;
import br.edu.fei.hotel.common.model.ComboboxVO;

public interface CadastroClienteService
{
	ClienteVO findClienteByNome(ClienteVO cliente) throws Exception;
	boolean save(ClienteVO cliente) throws Exception;
	boolean remove(long codigoCliente) throws Exception;
	Structure<ComboboxVO> getAllClientesCombobox() throws Exception;
}