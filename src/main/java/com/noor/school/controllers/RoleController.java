package com.noor.school.controllers;

import com.noor.school.entities.Role;
import com.noor.coronavirus.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(path = "createRole",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Role create(@RequestBody Role role){
        return roleRepository.save(role);
    }

    @PatchMapping(path = "updateRole")
    public Role update(@RequestBody Role role){
        return roleRepository.save(role);
    }

    @DeleteMapping(path = "deleteRole/{id}")
    public void delete(@PathVariable Long id){
        try{
            roleRepository.delete(roleRepository.getOne(id));
        }catch(Exception e){
            throw new RuntimeException("Action impossible car l'element à des dépendences");
        }

    }
}
