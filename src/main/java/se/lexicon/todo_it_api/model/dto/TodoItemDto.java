package se.lexicon.todo_it_api.model.dto;

import java.time.LocalDate;

public class TodoItemDto {

    private Integer todoId;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private PersonDtoSmall assignee;

    public TodoItemDto() {
    }

    public TodoItemDto(Integer todoId, String title, String description, LocalDate deadline, boolean done, PersonDtoSmall assignee) {
        this.todoId = todoId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.assignee = assignee;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public PersonDtoSmall getAssignee() {
        return assignee;
    }

    public void setAssignee(PersonDtoSmall assignee) {
        this.assignee = assignee;
    }
}
