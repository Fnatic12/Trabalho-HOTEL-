package br.edu.fei.hotel.hotelcrud.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author vitor
 */
@Configuration
public class WebConfiguration
{
    @Bean
    public LayoutDialect layoutDialect()
    {
        return new LayoutDialect(new GroupingStrategy());
    }
}