package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Antonio", "Jordan"));
		this.lista.add(new Usuario(2, "Jose", "Lopez"));
		this.lista.add(new Usuario(3, "Ramadan", "Rallo"));
		this.lista.add(new Usuario(4, "Moises", "Suil"));
		this.lista.add(new Usuario(5, "Lalo", "Rodriguez"));
		this.lista.add(new Usuario(6, "Antonio", "Perez"));
		this.lista.add(new Usuario(7, "Perez", "Reverte"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario getById(Integer id) {
		Usuario resultado= null;
		for(Usuario u:this.lista) {
			if(u.getId().equals(id)) {
				resultado= u;
				break;
			}
		}
		return resultado;
	}

}
