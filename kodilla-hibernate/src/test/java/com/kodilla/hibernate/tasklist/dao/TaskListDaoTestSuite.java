package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LASTNAME = "TaskList One";
    private static final String DESCRIPTION = "Zadanie 17.2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LASTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String lastName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(lastName);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }
}