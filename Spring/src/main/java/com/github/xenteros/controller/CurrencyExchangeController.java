package com.github.xenteros.controller;

import com.github.xenteros.dto.CurrencyExchangeResultDto;
import com.github.xenteros.model.CurrencyExchangeEntry;
import com.github.xenteros.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/currency-exchange")
public class CurrencyExchangeController {

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @GetMapping("/{cur1}/{amount}/{cur2}")
    public CurrencyExchangeResultDto exchangeCurrencies(@PathVariable String cur1, @PathVariable String amount, @PathVariable String cur2) {

        return currencyExchangeService.getExchangeRATE(cur1, cur2, amount);
    }
    @GetMapping
    public List<CurrencyExchangeEntry> findAll(){
        return currencyExchangeService.getAll();
    }
    @GetMapping("/page")
    public Page<CurrencyExchangeEntry> getPage(@RequestParam(name = "size", defaultValue = "5") Integer pageSize,
                                               @RequestParam(name = "index", defaultValue = "1") Integer pageNumber,
                                               @RequestParam(name = "sortDirection", defaultValue = "ASC") Sort.Direction sortDirection,
                                               @RequestParam(name = "sortProperties", defaultValue = "id")String properties) {

        Pageable page = new PageRequest(pageNumber, pageSize, sortDirection,properties );
        return currencyExchangeService.getPage(page);
    }
}
