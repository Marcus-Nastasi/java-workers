package com.novaRest.app.newWorkers.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.novaRest.app.newWorkers.Repo.WorkerRepo;
import com.novaRest.app.newWorkers.Models.Worker;

import java.util.List;

@RestController
public class Crud {

    @Autowired
    private WorkerRepo workerRepo;

    @GetMapping(value = "/")
    public String getHome() {
        return "Wellcome to RESTapi 2!";
    };

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping(value = "/api/workers")
    public List<Worker> getWorkers() {
        return workerRepo.findAll();
    };

    @GetMapping(value = "/api/workers/{id}")
    public Worker getSingle(@PathVariable long id) {
        return workerRepo.findById(id).get();
    };

    @PostMapping(value = "/api/worker/create")
    public void addWorker(@RequestBody Worker worker) {
        workerRepo.save(worker);
    };

    @PutMapping(value = "/api/worker/update/{id}")
    public void update(@PathVariable long id, @RequestBody Worker worker) {
        Worker toUpdate = workerRepo.findById(id).get();
        toUpdate.setNome(worker.getNome());
        toUpdate.setSobrenome(worker.getSobrenome());
        toUpdate.setIdade(worker.getIdade());
        toUpdate.setCargo(worker.getCargo());
        workerRepo.save(toUpdate);
    };

    @DeleteMapping(value = "/api/worker/delete/{id}")
    public void deleteWorker(@PathVariable long id) {
        workerRepo.deleteById(id);
    };

}

