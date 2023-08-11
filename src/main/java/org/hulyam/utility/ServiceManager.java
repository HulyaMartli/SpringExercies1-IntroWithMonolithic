package org.hulyam.utility;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class ServiceManager<T, ID> implements IService<T, ID> {
    private final JpaRepository<T, ID> jpaRepository;

    public ServiceManager(JpaRepository<T, ID> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public T save(T t) {
        return jpaRepository.save(t);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> t) {
        return jpaRepository.saveAll(t);
    }

    @Override
    public T update(T t) {
        return jpaRepository.save(t);
    }

    @Override
    public void delete(T t) {
        jpaRepository.delete(t);
    }

    @Override
    public void deleteById(ID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        return jpaRepository.findById(id);
    }

    @Override
    public Iterable<T> findAll() {
        return jpaRepository.findAll();
    }
}
