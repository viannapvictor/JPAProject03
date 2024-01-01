package br.com.victor.services;

import br.com.victor.dao.Persistente;
import br.com.victor.dao.generic.IGenericDAO;
import br.com.victor.exceptions.DAOException;
import br.com.victor.exceptions.MaisDeUmRegistroException;
import br.com.victor.exceptions.TableException;
import br.com.victor.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericJpaService <T extends Persistente, E extends Serializable>
        implements IGenericJpaService<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericJpaService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
