package com.demo.demo.controller;

import com.demo.demo.data.entitie.Billionaire;
import com.demo.demo.data.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/billionaires")
public class BillionaireController {

    @Autowired
    private BillionaireService billionaireService;

    @PostMapping("/add")
    public ResponseEntity<Billionaire> addBillionaire(@RequestBody Billionaire billionaire){
        Billionaire addedBillionaire = billionaireService.addOne(billionaire);
        return new ResponseEntity<>(addedBillionaire, HttpStatus.CREATED);
    }
}
