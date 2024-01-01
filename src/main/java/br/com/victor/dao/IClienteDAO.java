/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.IGenericDAO;
import br.com.victor.domain.Cliente;

/**
 * @author victor.vianna
 *
 */
public interface IClienteDAO<T extends Persistente> extends IGenericDAO<T, Long>{

}
