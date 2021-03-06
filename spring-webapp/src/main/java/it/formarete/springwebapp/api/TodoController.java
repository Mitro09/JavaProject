package it.formarete.springwebapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
		Todo td = todos.findById(id);
		if (td == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Not Found!");
		}
		return td;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Todo add(@RequestBody Todo body) {
		return todos.save(body);
	}
	
	@PutMapping("/{id}")
	public Todo replace(@PathVariable Integer id, @RequestBody Todo body) {
		Todo td = get(id);
		body.setId(td.getId());
		return todos.save(body);
	}
	
	@DeleteMapping("/{id}")
	public Todo remove(@PathVariable Integer id) {
		return todos.deleteFromId(id);
	}
	
	@PatchMapping("/{id}")
	public Todo merge(@PathVariable Integer id, @RequestBody Todo body) {
		Todo td = get(id);
		body.setId(td.getId());
		return todos.merge(body);
	}
	
	@GetMapping("/update/{id}")
	public Todo done(@PathVariable Integer id) {
		return todos.update(id);
	}
}
