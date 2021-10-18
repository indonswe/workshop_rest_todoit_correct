package se.lexicon.todo_it_api.service;

import se.lexicon.todo_it_api.model.dto.PersonDto;
import se.lexicon.todo_it_api.model.forms.PersonFormDto;

import java.util.List;

//Contract
public interface PersonService {

    //Crud + convenience methods

    PersonDto create (PersonFormDto form);
    boolean delete(Integer personId);
    PersonDto update(Integer personId, PersonFormDto updateForm);
    PersonDto findById(Integer personId);
    List<PersonDto> findAll();
    List<PersonDto> findIdlePeople();

    PersonDto addTodoItem(Integer personId, Integer todoItemId);
    PersonDto removeTodoItem(Integer personId, Integer todoItemId);

}
