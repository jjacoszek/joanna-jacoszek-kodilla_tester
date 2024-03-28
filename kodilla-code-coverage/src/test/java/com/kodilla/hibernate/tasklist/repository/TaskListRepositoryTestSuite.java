package com.kodilla.hibernate.tasklist.repository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private TaskList taskList;

    @BeforeEach
    void setUp() {
        taskList = new TaskList("Test List", "Test Description");
        taskListRepository.save(taskList);
    }

    @AfterEach
    void tearDown() {
        taskListRepository.deleteAll();
    }

    @Test
    void testFindByListName() {
        // Given
        String listName = "Test List";

        // When
        List<TaskList> foundLists = taskListRepository.findByListName(listName);

        // Then
        assertEquals(1, foundLists.size());
        assertTrue(foundLists.contains(taskList));
    }
}