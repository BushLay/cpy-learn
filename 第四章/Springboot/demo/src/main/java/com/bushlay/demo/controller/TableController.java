//package com.bushlay.demo.controller;
//
//import com.bushlay.demo.entity.Table;
//import com.bushlay.demo.service.TableService;
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/tables")
//public class TableController {
//
//    @Autowired
//    private TableService tableService;
//
//    @RequestMapping("/create")
//    public void createTable() {
//        Table table = new Table();
//        table.setName("my_new_table");
//        tableService.createTable(table);
//    }
//}
