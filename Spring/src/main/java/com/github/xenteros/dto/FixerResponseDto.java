package com.github.xenteros.dto;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by RENT on 2017-10-23.
 */
public class FixerResponseDto {

    private String base;
    private String date;
    private Map<String, String> rates;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, String> getRates() {
        return rates;
    }

    public void setRates(Map<String, String> rates) {
        this.rates = rates;
    }
}
