package org.hulyam.service;

import org.hulyam.repository.IUserRepository;
import org.hulyam.repository.entity.User;
import org.hulyam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public User findByAddress(String address) {
        return userRepository.findByAddress(address);
    }

    public User findByNameAndAddress(String name, String address) {
        return userRepository.findByNameAndAddress(name, address);
    }

    public List<User> findByNameOrAddress(String name, String address) {
        return userRepository.findByNameOrAddress(name, address);
    }

    public User findByNameAndAddressAndTel(String name, String address, String tel) {
        return userRepository.findByNameAndAddressAndTel(name, address, tel);
    }

    public List<User> findAllByCity(String city) {
        return userRepository.findAllByCity(city);
    }

    public List<User> findAllByNameStartsWith(String word){
        return userRepository.findAllByNameStartsWith(word);
    }

    public Optional<User> findOptionalByNameAndTel(String name, String tel){
        return userRepository.findOptionalByNameAndTel(name, tel);
    }

    public List<User> findAllByNameOrderByIdDesc(String name){
        return userRepository.findAllByNameOrderByIdDesc(name);
    }

    public List<User> findTop3ByNameOrderById(String name){
        return userRepository.findTop3ByNameOrderById(name);
    }
}
