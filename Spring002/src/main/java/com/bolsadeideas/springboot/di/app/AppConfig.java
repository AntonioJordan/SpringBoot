package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	@Bean("servicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("servicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean
	public List<ItemFactura> registrarItems() {
		Producto producto = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta", 125);

		ItemFactura linea1 = new ItemFactura(producto, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 5);

		return Arrays.asList(linea1, linea2);
	}
}
