package org.sbx.sjblog.dao.impl;

import org.sbx.sjblog.dao.Dao;
import org.sbx.sjblog.entity.impl.Comment;

import java.sql.SQLException;
import java.util.List;

public class CommentDao implements Dao <Integer, Comment> {
    public List<Comment> getAll() throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void create(Comment o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void update(Comment o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void delete(Comment o) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public Comment getObjectById(Integer id) throws SQLException {
        throw new UnsupportedOperationException();
    }
}
