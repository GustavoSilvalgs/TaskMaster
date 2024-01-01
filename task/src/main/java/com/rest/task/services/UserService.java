package com.rest.task.services;

import com.rest.task.dtos.UserRegistrationDto;
import com.rest.task.mapper.DozerMapper;
import com.rest.task.models.User;
import com.rest.task.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserRegistrationDto create(UserRegistrationDto userRegistrationDto) {
        var entity = DozerMapper.parseObject(userRegistrationDto, User.class);
        var dto = DozerMapper.parseObject(repository.save(entity), UserRegistrationDto.class);
        return dto;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public User update(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
