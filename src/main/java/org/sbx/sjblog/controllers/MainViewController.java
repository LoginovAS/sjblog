package org.sbx.sjblog.controllers;

import org.sbx.sjblog.entity.impl.Record;
import org.sbx.sjblog.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainViewController {

    @Autowired
    @Qualifier("recordService")
    private ObjectService service;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String showAll(ModelMap map) throws SQLException {

        List<Record> records = service.getAll();

        map.addAttribute("records", records);

        return "main";

    }

}
