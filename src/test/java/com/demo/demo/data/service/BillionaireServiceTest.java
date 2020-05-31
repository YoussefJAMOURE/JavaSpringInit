package com.demo.demo.data.service;

import com.demo.demo.data.entitie.Billionaire;
import com.demo.demo.data.repository.BillionaireRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

@ExtendWith(MockitoExtension.class)
public class BillionaireServiceTest {

    @Mock
    private BillionaireRepository billionaireRepository;

    @InjectMocks
    private BillionaireService billionaireService;

    @Test
    public void should_add_one_billionaire(){
        Mockito.when(billionaireRepository.save(Mockito.any(Billionaire.class))).thenReturn(new Billionaire());
        Assert.isInstanceOf(Billionaire.class, billionaireService.addOne(new Billionaire()));
    }
}
