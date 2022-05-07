package com.mehdi.spring.repository;

import java.util.List;

public interface ObjectRepository<T> {

	public void store(T t);
	
	public T retrieve(int id);
	
	public T search(String name);
	
	public T delete(int id);
	
	public List<T> getAll();
}
