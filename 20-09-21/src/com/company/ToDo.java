package com.company;

public class ToDo {

    private int todoId;
    private String todoName;

    public ToDo() {
    }

    public ToDo(int todoId, String todoName) {
        this.todoId = todoId;
        this.todoName = todoName;
    }

    public  String displayToDo(ToDo toDo) throws NullPointerException
    {
        if (toDo==null)
        {
            throw new NullPointerException("todo is null");
        }
        return  toDo.toString();
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "todoId=" + todoId +
                ", todoName='" + todoName + '\'' +
                '}';
    }
}
