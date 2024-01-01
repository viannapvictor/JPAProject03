/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDAO;
import br.com.victor.dao.generic.GenericDB1DAO;
import br.com.victor.domain.Produto;
import br.com.victor.domain.Venda;

public class ProdutoDAO extends GenericDB1DAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
