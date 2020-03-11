package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("do");
        board.getInProgressList().getTasks().add("progress");
        board.getDoneList().getTasks().add("done");

        //Then
        board.readTask();
    }

    @Test
    public void testTaskAddList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);
        board.getToDoList().addTasks("do");
        board.getInProgressList().addTasks("progress");
        board.getDoneList().addTasks("done");

        //Then
        board.readTask();
    }
}
