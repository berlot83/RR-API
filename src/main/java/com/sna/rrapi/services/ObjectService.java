package com.sna.rrapi.services;

import java.util.List;

@SuppressWarnings("hiding")
public interface ObjectService<Object> {
	public Object save(Object object);
	public Object update(Object object);
	public Object delete(Object object);
	public Object get(String dni);
	public List<Object> getAll();
}
