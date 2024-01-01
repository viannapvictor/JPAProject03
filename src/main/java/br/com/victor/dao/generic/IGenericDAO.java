/**
 * 
 */
package br.com.victor.dao.generic;

import br.com.victor.dao.Persistente;
import br.com.victor.exceptions.DAOException;
import br.com.victor.exceptions.MaisDeUmRegistroException;
import br.com.victor.exceptions.TableException;
import br.com.victor.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO<T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
