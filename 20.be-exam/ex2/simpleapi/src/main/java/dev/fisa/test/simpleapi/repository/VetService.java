package dev.fisa.test.simpleapi.repository;

import dev.fisa.test.simpleapi.model.Vet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VetService implements VetRepository{
    private final VetRepository vetRepository;

    @Override
    public <S extends Vet> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Vet> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Vet> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Vet> findAll() {
        List<Vet> result = new ArrayList<>();
        vetRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Iterable<Vet> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Vet entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vet> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
