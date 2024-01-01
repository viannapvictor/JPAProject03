/**
 * 
 */
package br.com.victor.dao.generic;

import br.com.victor.dao.Persistente;

import java.io.Serializable;

/**
 * @author rodrigo.pires
 *
 */
public abstract class GenericDB2DAO<T extends Persistente, E extends Serializable>
	extends GenericDAO<T,E> {

	public GenericDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
