package com.IDao.config;

import org.hibernate.SessionFactory;

import pack.qualy_pro.DaoImpl.CategorieImpl;
import pack.qualy_pro.DaoImpl.DetailsFactprodImpl;
import pack.qualy_pro.DaoImpl.FactureImpl;
import pack.qualy_pro.DaoImpl.FournisseurImpl;
import pack.qualy_pro.DaoImpl.MagasinImpl;
import pack.qualy_pro.DaoImpl.PavillionImpl;
import pack.qualy_pro.DaoImpl.PrixImpl;
import pack.qualy_pro.DaoImpl.ProduitImpl;
import pack.qualy_pro.DaoImpl.UtilisateurImpl;

/**
 * @author BECHAR
 *
 */
public class DAOFactory extends AbstractDAOFactory {

	protected static SessionFactory sf=null;
	
	@Override
	public DAO<?> get_Categorie_DAO() {
		// TODO Auto-generated method stub
		return new CategorieImpl(sf);
	}

	@Override
	public DAO<?> get_Client_DAO() {
		// TODO Auto-generated method stub
		return new CategorieImpl(sf);
	}

	@Override
	public DAO<?> get_DetailsFactprod_DAO() {
		// TODO Auto-generated method stub
		return new DetailsFactprodImpl(sf);
	}

	@Override
	public DAO<?> get_Facture_DAO() {
		// TODO Auto-generated method stub
		return new FactureImpl(sf);
	}

	@Override
	public DAO<?> get_Fournisseur_DAO() {
		// TODO Auto-generated method stub
		return new FournisseurImpl(sf);
	}

	@Override
	public DAO<?> get_Magasin_DAO() {
		// TODO Auto-generated method stub
		return new MagasinImpl(sf);
	}

	@Override
	public DAO<?> get_Pavillion_DAO() {
		// TODO Auto-generated method stub
		return new PavillionImpl(sf);
	}

	@Override
	public DAO<?> get_Prix_DAO() {
		// TODO Auto-generated method stub
		return new PrixImpl(sf);
	}

	@Override
	public DAO<?> get_Produit_DAO() {
		// TODO Auto-generated method stub
		return new ProduitImpl(sf);
	}

	@Override
	public DAO<?> get_Utilisateur_DAO() {
		// TODO Auto-generated method stub
		return new UtilisateurImpl(sf);
	}

}
