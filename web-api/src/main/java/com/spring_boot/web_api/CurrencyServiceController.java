package com.spring_boot.web_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    CurrencyServiceConfig configCurrency;
    @RequestMapping(value = "/currency")
    public CurrencyServiceConfig get(){
        return configCurrency;
    }
}
