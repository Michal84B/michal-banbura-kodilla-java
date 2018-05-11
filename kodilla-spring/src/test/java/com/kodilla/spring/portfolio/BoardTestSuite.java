package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Eat");
        board.getDoneList().addTask("Wake up");
        board.getInProgressList().addTask("Learning Java");

        //When
        String toDoList = board.getToDoList().getTask(0);
        String doneList = board.getDoneList().getTask(0);
        String inProgressList = board.getInProgressList().getTask(0);

        //Then
    }
}
