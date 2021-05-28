package it.formarete.springwebapp.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import it.formarete.springwebapp.domain.Todo;

@Repository
public class TodoDB {
	
	private static int id=1;
	private Map<Integer,Todo> todos;
	
	public TodoDB(Todo td) {
		todos = new HashMap<>();
		add("learn JAVA", true);
		add("finish page",false);
		add("forget",null);
	}
	
	public List<Todo> findAll(){
		return new ArrayList<>(todos.values());
	}
	
	public Todo findById(Integer id) {
		return todos.get(id);
	}
	
	public Todo add(String text, Boolean done) {
		Todo td = new Todo();
		td.setText(text);
		td.setDone(done);
		return save(td);
	}

	public Todo save(Todo td) {
		boolean isNew = td.getId() == null;
		if(isNew) {
			td.setId(id);
			id++;
		}
		todos.put(td.getId(), td);
		return td;
	}
	
	public Todo delete(Todo td) {
		return todos.remove(td.getId());
	}
	
	public Todo deleteFromId(Integer id) {
		return todos.remove(id);
	}
	
	public Todo update(Integer id) {
		if(!todos.get(id).getDone()) {
			todos.get(id).setDone(true);
		}
		return todos.get(id);
	}
}
