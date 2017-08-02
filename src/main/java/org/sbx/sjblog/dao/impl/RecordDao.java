package org.sbx.sjblog.dao.impl;

import org.sbx.sjblog.dao.Dao;
import org.sbx.sjblog.entity.impl.Record;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class RecordDao implements Dao <Integer, Record> {

    @PersistenceContext(unitName = "sjblog_PU")
    private EntityManager entityManager;

    public List<Record> getAll() throws SQLException {
        Query query = entityManager.createNamedQuery("getRecords");
        return query.getResultList();
    }

    public void create(Record o) throws SQLException {
        entityManager.persist(o);
    }

    public void update(Record o) throws SQLException {
        entityManager.merge(o);
    }

    public void delete(Record o) throws SQLException {
        if (entityManager.contains(o)) {
            entityManager.remove(o);
        } else {
            entityManager.remove(entityManager.merge(o));
        }

    }

    public Record getObjectById(Integer id) throws SQLException {
        return entityManager.find(Record.class, id);
    }
}
