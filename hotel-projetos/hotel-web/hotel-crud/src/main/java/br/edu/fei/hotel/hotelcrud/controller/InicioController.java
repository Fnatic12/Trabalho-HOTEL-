package br.edu.fei.hotel.hotelcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fei.hotel.hotelcrud.utils.ConstantDataManager;

@Controller
@RequestMapping(value = ConstantDataManager.INICIO_CONTROLLER)
public class InicioController
{
	@RequestMapping(value = ConstantDataManager.INICIO_OPEN_METHOD)
    public static String open(final HttpServletRequest request) throws Exception
    {
        String result = ConstantDataManager.RESULT_INICIO_OPEN_METHOD;
        
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
        
        request.setAttribute(br.com.fei.hotel.common.utils.ConstantDataManager.MESSAGE, message);
        request.setAttribute(br.com.fei.hotel.common.utils.ConstantDataManager.STATUS, status);
        
        return result;
    }
}