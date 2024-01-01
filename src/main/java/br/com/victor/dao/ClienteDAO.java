/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDAO;
import br.com.victor.dao.generic.GenericDB1DAO;
import br.com.victor.domain.Cliente;

/**
 * @author victor.vianna
 *
 */
public class ClienteDAO extends GenericDB1DAO<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
