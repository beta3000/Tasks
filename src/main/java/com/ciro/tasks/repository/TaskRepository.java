package com.ciro.tasks.repository;

import com.ciro.tasks.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
