package com.example.REDIS.CONTROLLER;

import com.example.REDIS.model.Country;
import com.example.REDIS.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    // Constructor injection
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    // 1. CREATE
    @PostMapping
    public String addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    // 2. READ ALL
    @GetMapping
    public List<Object> getAllCountries() {
        return countryService.getAllCountries();
    }

    // 3. READ ONE
    @GetMapping("/{id}")
    public Object getCountryById(@PathVariable Integer id) {
        return countryService.getCountryById(id);
    }

    // 4. UPDATE
    @PutMapping
    public String updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }

    // 5. DELETE
    @DeleteMapping("/{id}")
    public String deleteCountry(@PathVariable Integer id) {
        return countryService.deleteCountry(id);
    }
}