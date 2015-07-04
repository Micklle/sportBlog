package com.sport.blog.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import com.sport.blog.dao.GeneralDAO;

public abstract class GeneralDaoImpl<E> implements GeneralDAO<E> {

	private Class<E> elementClass;
	
	@PersistenceContext(name="sportBlog")
	EntityManager entityManager;

	public GeneralDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;

	}

	@Transactional
	public void addElement(E element) {
		entityManager.persist(element);
		entityManager.flush();
	}
	@Transactional
	public E updateElement(E element) {
		return entityManager.merge(element);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public E getElementByID(Integer elementId) {		
		return (E) entityManager.createQuery("from " + elementClass.getSimpleName() + " e where e.id = :id").setParameter("id", elementId).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<E> getAllElements() {
		return entityManager.createQuery("from " + elementClass.getSimpleName())
				.getResultList();
	}
	
	@Transactional
	public void deleteElement(E element) {
		entityManager.remove(entityManager.merge(element));
	}
}
