/**
 * 
 */
package com.IDao.config;

/**
 * @author BECHAR
 *
 */
public abstract class AbstractDAOFactory {

	public abstract DAO<?> get_Categorie_DAO();
	public abstract DAO<?> get_Client_DAO();
	public abstract DAO<?> get_DetailsFactprod_DAO();
	public abstract DAO<?> get_Facture_DAO();
	public abstract DAO<?> get_Fournisseur_DAO();
	public abstract DAO<?> get_Magasin_DAO();
	public abstract DAO<?> get_Pavillion_DAO();
	public abstract DAO<?> get_Prix_DAO();
	public abstract DAO<?> get_Produit_DAO();
	public abstract DAO<?> get_Utilisateur_DAO();

	public static AbstractDAOFactory getFatory(DAO_TYPES type){

		if(type.equals(DAO_TYPES.DAO_FACTORY))
			return new DAOFactory();

		return null;
	}
	
	
}
