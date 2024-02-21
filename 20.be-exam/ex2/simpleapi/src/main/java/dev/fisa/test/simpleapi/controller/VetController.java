package dev.fisa.test.simpleapi.controller;

import dev.fisa.test.simpleapi.model.Vet;
import dev.fisa.test.simpleapi.repository.VetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/vets")
@RequiredArgsConstructor
public class VetController {
    VetRepository vetRepository;
    @GetMapping
    public List<Vet> findAll(){
        return vetRepository.findAll().iterator().st;
    }
}
