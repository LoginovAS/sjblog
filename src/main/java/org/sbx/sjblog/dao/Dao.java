package org.sbx.sjblog.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao <K, E> {

    List<E> getAll() throws SQLException;
    void create(E o) throws SQLException ;
    void update(E o) throws SQLException;
    void delete(E o) throws SQLException;
    E getObjectById(K id) throws SQLException;

}
