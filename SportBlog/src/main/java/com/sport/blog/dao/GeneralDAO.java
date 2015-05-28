package com.sport.blog.dao;

import java.util.List;

public interface GeneralDAO<E> {
	
	public void addElement(E element);

    public void updateElement(E element);

    public E getElementByID(Integer elementId);

    public List<E> getAllElements();

    public void deleteElement(E element);

}
