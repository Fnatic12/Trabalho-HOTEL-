package br.edu.fei.hotel.hotelcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.fei.hotel.common.utils.ConstantDataManager;

@SpringBootApplication
@ComponentScan(value = { ConstantDataManager.BASE_PACKAGE })
public class HotelCrudApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(HotelCrudApplication.class, args);
	}
}