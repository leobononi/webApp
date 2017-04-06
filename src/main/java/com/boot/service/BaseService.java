package com.boot.service;

import java.util.List;

public interface BaseService<T> {
	
	T get(int id); 
	List<T> getAll();
}
