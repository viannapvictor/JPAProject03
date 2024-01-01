/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDB3DAO;
import br.com.victor.domain.Cliente;
import br.com.victor.domain.Cliente2;

public class ClienteDB3DAO extends GenericDB3DAO<Cliente2, Long> implements IClienteDAO<Cliente2> {

	public ClienteDB3DAO() {
		super(Cliente2.class);
	}

}
