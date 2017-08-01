package org.sbx.sjblog.dao;

import org.sbx.sjblog.entity.DBObject;

import java.util.List;

/**
 * Created by loginov_a_s on 01.08.2017.
 */
public interface Dao {

    Integer create(DBObject o);
    Integer update(DBObject o);
    Integer delete(DBObject o);
    List<DBObject> read(Object o);

}
