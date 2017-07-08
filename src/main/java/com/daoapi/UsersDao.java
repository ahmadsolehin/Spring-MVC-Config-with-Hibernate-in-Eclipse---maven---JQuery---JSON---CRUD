package com.daoapi;

import java.util.List;

import com.entities.Users;

public interface UsersDao {
	public boolean saveOrUpdate(Users users);
	public List<Users> list();
	public boolean delete(Users users);
}
