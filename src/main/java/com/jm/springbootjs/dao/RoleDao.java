package com.jm.springbootjs.dao;

import com.jm.springbootjs.model.Role;
import com.jm.springbootjs.model.Role;

import java.util.List;

public interface RoleDao {
    Role getByName(String name);

    List<Role> getAll();

    void add(Role role);
}
