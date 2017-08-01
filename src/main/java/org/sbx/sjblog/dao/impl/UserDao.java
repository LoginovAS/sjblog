package org.sbx.sjblog.dao.impl;

import org.sbx.sjblog.dao.Dao;
import org.sbx.sjblog.entity.impl.User;

import java.sql.SQLException;
import java.util.List;

public class UserDao implements Dao <Integer, User> {
    public List<User> getAll() throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void create(User o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void update(User o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void delete(User o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public User getObjectById(Integer id) throws SQLException {
        throw new UnsupportedOperationException();
    }
}
