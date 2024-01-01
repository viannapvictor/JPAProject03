/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDAO;
import br.com.victor.domain.Cliente;

/**
 * @author victor.vianna
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
