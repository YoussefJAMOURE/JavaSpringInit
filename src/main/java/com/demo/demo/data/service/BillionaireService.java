package com.demo.demo.data.service;

import com.demo.demo.data.entitie.Billionaire;
import com.demo.demo.data.repository.BillionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BillionaireService {

    @Autowired
    private BillionaireRepository billionaireRepository;

    public Billionaire addOne(Billionaire billionaire){
        return billionaireRepository.save(billionaire);
    }
}
