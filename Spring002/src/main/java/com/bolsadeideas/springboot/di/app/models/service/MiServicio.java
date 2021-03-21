package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("servicioSimple")
//@Primary
public class MiServicio implements IServicio{
	@Override
	public String operacion() {
		return "Ejecutando un proceso importante simple...";
	}
}
