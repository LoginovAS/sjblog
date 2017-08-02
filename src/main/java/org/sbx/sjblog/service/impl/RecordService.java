package org.sbx.sjblog.service.impl;

import org.sbx.sjblog.dao.Dao;
import org.sbx.sjblog.entity.impl.Record;
import org.sbx.sjblog.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class RecordService implements ObjectService<Integer, Record> {

    @Autowired
    @Qualifier("recordDao")
    private Dao dao;

    public List<Record> getAll() throws SQLException {
        return dao.getAll();
    }

    public void create(Record o) throws SQLException {
        dao.create(o);
    }

    public void update(Record o) throws SQLException {
        dao.update(o);
    }

    public void delete(Record o) throws SQLException {
        dao.delete(o);
    }

    public Record findById(Integer id) throws SQLException {
        return (Record) dao.getObjectById(id);
    }
}
