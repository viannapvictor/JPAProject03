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
public abstract class GenericDB3DAO<T extends Persistente, E extends Serializable>
	extends GenericDAO<T,E> {

	public GenericDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
