/**
 * 
 */
package com.IDao.config;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 * @author BECHAR
 *
 */
public abstract class DAO<T> {
	
	private SessionFactory sf=null;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public DAO(SessionFactory sf){
		this.sf=sf;
	}

	public boolean create(T obj){
		Session session=sf.openSession();
		boolean status;
		Transaction tx=session.beginTransaction();
		try {
			session.save(obj);
			tx.commit();
			status=true;
		} catch (Exception e) {
			// TODO: handle exception
			status=false;
		}
		session.close();
		return status;
	}
	
	public boolean delete(T obj){
		Session session=sf.openSession();
		boolean status;
		Transaction tx=session.beginTransaction();
		try {
			session.delete(obj);
			tx.commit();
			status=true;
		} catch (Exception e) {
			// TODO: handle exception
			status=false;
		}
		session.close();
		return status;

	}
	
	@SuppressWarnings({ "unchecked", "null" })
	public boolean deleteById(long id){
		Session session=sf.openSession();
		T obj=null;
		boolean status;
		Transaction tx=session.beginTransaction();
		try {
			obj=(T)session.load(obj.getClass(),new Long(id));
			session.delete(obj);
			tx.commit();
			status=true;
		} catch (Exception e) {
			// TODO: handle exception
			status=false;
		}
		session.close();
		return status;
	}
	public boolean update(T obj){
		Session session=sf.openSession();
		boolean status;
		Transaction tx=session.beginTransaction();
		try {
			session.update(obj);
			tx.commit();
			status=true;
		} catch (Exception e) {
			// TODO: handle exception
			status=false;
		}
		session.close();
		return status;
	}
	
	@SuppressWarnings({ "unchecked", "null" })
	public T findById(long id){
		Session session=sf.openSession();
		T obj = null;
		Transaction tx=session.beginTransaction();
		obj=(T)session.get(obj.getClass(),id);
		tx.commit();
		session.close();
		return obj;
		
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> findAll(String whereExp){
		List<T> objs=new ArrayList<T>();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		objs=session.createQuery("FROM "+objs.getClass()+" "+whereExp).list();
		tx.commit();
		session.close();
		return objs;
	}
}
