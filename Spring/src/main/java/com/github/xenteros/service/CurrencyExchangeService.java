package com.github.xenteros.service;

import com.github.xenteros.dto.CurrencyExchangeResultDto;
import com.github.xenteros.model.CurrencyExchangeEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by RENT on 2017-10-25.
 */
public interface CurrencyExchangeService {

    List<CurrencyExchangeEntry> getAll();
    CurrencyExchangeResultDto getExchangeRATE(String from, String to, String amount);

    Page<CurrencyExchangeEntry> getPage(Pageable page);
}
