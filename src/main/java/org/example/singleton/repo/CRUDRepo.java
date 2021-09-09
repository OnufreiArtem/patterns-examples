package org.example.singleton.repo;

import java.util.List;

public interface CRUDRepo<T> {

	void add(T item);

	void addMany(T... list);

	void update(T item);

	void remove(Long id);

	T get(Long id);

	List<T> getAll();
}
