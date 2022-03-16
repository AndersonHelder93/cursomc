package com.example.demo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) { 
		 Optional<Categoria> obj = categoriaRepository.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));  
		} 


	
}
