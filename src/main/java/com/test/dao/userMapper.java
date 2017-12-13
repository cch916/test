package com.test.dao;

import java.util.List;

public interface userMapper<user, Integer> {

	List<user> getList() throws Exception;

}
