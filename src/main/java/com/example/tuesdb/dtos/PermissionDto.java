package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Permission;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class PermissionDto {

    private Long id;

    @NotBlank
    private String data;

    private Set<UserDto> users;

    private Set<GroupDto> groups;

    public PermissionDto(Permission p) {
        this.id = p.getId();
        this.data = p.getData();
    }

    public Set<GroupDto> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupDto> groups) {
        this.groups = groups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Set<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDto> users) {
        this.users = users;
    }
}
