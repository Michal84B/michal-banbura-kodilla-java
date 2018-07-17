package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework adamKowalskiHomework = new AdamKowalskiHomework();
        Homework janNowakHomework = new JanNowakHomework();
        Mentor johnSmith = new Mentor("Johnt Smith");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        adamKowalskiHomework.registerHomeworkObserver(johnSmith);
        adamKowalskiHomework.registerHomeworkObserver(jessiePinkman);
        janNowakHomework.registerHomeworkObserver(jessiePinkman);
        //When
        adamKowalskiHomework.addTask("Homework task 1");
        adamKowalskiHomework.addTask("Homework task 2");
        adamKowalskiHomework.addTask("Homework task 3");
        janNowakHomework.addTask("Homework task 1");
        janNowakHomework.addTask("Homework task 2");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
