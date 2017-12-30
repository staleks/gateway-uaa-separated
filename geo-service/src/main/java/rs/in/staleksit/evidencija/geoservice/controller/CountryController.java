package rs.in.staleksit.evidencija.geoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rs.in.staleksit.evidencija.geoservice.model.Country;
import rs.in.staleksit.evidencija.geoservice.service.CountryService;

import java.util.List;

@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/api/countries")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @GetMapping("/api/countries/{alpha2}")
    public Country findOne(@PathVariable("alpha2") String alpha2) {
        return countryService.findOne(alpha2);
    }

}
