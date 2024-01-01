/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDB2DAO;
import br.com.victor.domain.Cliente;

public class ClienteDB2DAO extends GenericDB2DAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDB2DAO() {
		super(Cliente.class);
	}

}
