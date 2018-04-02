package com.kevinpinchi.springboot.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kevinpinchi.springboot.app.entity.Cliente;

//En lugar de heredar de CrudRepository, hacemos una herencia a PagingAndSortingRepository
//para poder utilizar la paginación ya que esta clase tambien hereda de CrudRepository
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

}
