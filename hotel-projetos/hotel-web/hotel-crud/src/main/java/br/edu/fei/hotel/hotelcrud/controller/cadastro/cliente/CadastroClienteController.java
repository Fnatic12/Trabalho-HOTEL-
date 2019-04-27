package br.edu.fei.hotel.hotelcrud.controller.cadastro.cliente;

import br.edu.fei.hotel.hotelcrud.utils.ConstantDataManager;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vitor
 */
@Controller
@RequestMapping(value = ConstantDataManager.CADASTRO_CLIENTE_CONTROLLER)
public class CadastroClienteController
{
    @RequestMapping(value = ConstantDataManager.CADASTRO_CLIENTE_OPEN_METHOD)
    public static String open(final HttpServletRequest request) throws Exception
    {
        String result = ConstantDataManager.RESULT_CADASTRO_CLIENTE_OPEN_METHOD;
        
        boolean status = false;
        String message = br.com.fei.hotel.common.utils.ConstantDataManager.BLANK;
        
        try
        {
            status = true;
        }
        catch(final Exception e)
        {
            message = e.getMessage();
            status = false;
            e.printStackTrace();
        }
        finally
        {
            //
        }
        
        return result;
    }
}