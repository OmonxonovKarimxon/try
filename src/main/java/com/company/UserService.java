package com.company;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserService {
    private final UserRepository repository;



    public UserEntity create(Dto dto) {
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setUserName(dto.getUserName());
        repository.save(entity);
        return  entity;
    }

    public  UserEntity   get(Integer id){
       Optional<UserEntity> byId = repository.findById(id);

       return byId.get();
    }
}
