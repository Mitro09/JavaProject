package it.formarete.springwebapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.formarete.springwebapp.domain.Todo;
import it.formarete.springwebapp.persistence.TodoDB;

@RestController
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	private TodoDB todos;
	
	@GetMapping
	public List<Todo> all(){
		return todos.findAll();
	}
	
	@GetMapping("/{id}")
	public Todo get(@PathVariable int id) {
		return todos.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Todo add(@RequestBody Todo body) {
		return todos.save(body);
	}
	
	public Todo replace(Integer id, Todo body) {
		Todo td = todos.findById(id);
		body.setId(td.getId());
		return todos.save(body);
	}
	
	@DeleteMapping("/{id}")
	public Todo remove(@PathVariable Integer id) {
		return todos.deleteFromId(id);
	}
	
	@GetMapping("/update/{id}")
	public Todo done(@PathVariable Integer id) {
		return todos.update(id);
	}
}
