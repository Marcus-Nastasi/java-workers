package com.novaRest.app.newWorkers.Repo;

import com.novaRest.app.newWorkers.Models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker, Long> {
}
