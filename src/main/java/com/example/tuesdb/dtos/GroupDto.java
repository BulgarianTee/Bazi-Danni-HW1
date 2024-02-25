package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Group;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class GroupDto {

    private Long id;

    @NotBlank
    private String groupName;

    private Set<UserDto> users;

    private Set<PermissionDto> permissions;

    public GroupDto(Group g) {
        this.id = g.getId();
        this.groupName = g.getGroupName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDto> users) {
        this.users = users;
    }

    public Set<PermissionDto> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<PermissionDto> permissions) {
        this.permissions = permissions;
    }
}
