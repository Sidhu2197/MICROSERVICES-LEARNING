package com.example.REDIS.service;

import com.example.REDIS.model.Country;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private HashOperations<String, Object, Object> opsForHash = null;
    private static final String REDIS_KEY = "COUNTRIES";

    public CountryService(RedisTemplate<String, Object> redis) {
        this.opsForHash = redis.opsForHash();
    }

    public String addCountry(Country country) {
        opsForHash.put(REDIS_KEY, country.getNo(), country);
        return "Country added successfully!";
    }

    public List<Object> getAllCountries() {
        return opsForHash.values(REDIS_KEY);
    }

    public Object getCountryById(Integer id) {
        return opsForHash.get(REDIS_KEY, id);
    }

    public String updateCountry(Country country) {
        opsForHash.put(REDIS_KEY, country.getNo(), country);
        return "Country updated successfully!";
    }

    public String deleteCountry(Integer id) {
        opsForHash.delete(REDIS_KEY, id);
        return "Country deleted successfully!";
    }
}