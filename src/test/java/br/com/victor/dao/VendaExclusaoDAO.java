/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDAO;
import br.com.victor.dao.IVendaDAO;
import br.com.victor.dao.generic.GenericDB1DAO;
import br.com.victor.domain.Venda;
import br.com.victor.exceptions.DAOException;
import br.com.victor.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoDAO extends GenericDB1DAO<Venda, Long> implements IVendaDAO {

	public VendaExclusaoDAO() {
		super(Venda.class);
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public Venda consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
