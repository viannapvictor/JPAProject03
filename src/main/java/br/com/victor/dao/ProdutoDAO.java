/**
 * 
 */
package br.com.victor.dao;

import br.com.victor.dao.generic.GenericDAO;
import br.com.victor.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
