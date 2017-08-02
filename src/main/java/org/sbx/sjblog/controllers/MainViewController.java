package org.sbx.sjblog.controllers;

import org.sbx.sjblog.entity.impl.Record;
import org.sbx.sjblog.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainViewController {

    @Autowired
    @Qualifier("recordService")
    private ObjectService<Integer, Record> service;

    @RequestMapping(value = "/record/", method = RequestMethod.GET)
    public ResponseEntity<List<Record>> getAllRecords() throws SQLException {
        List<Record> records = service.getAll();
        if (records.isEmpty()) {
            return new ResponseEntity<List<Record>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Record>>(records, HttpStatus.OK);
    }

    @RequestMapping(value = "/record/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Record> getRecord(@PathVariable("id") int id) throws SQLException {

        Record record = service.findById(id);

        if (record == null) {
            return new ResponseEntity<Record>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Record>(record, HttpStatus.OK);

    }

}
