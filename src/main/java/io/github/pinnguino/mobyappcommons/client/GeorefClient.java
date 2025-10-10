package io.github.pinnguino.mobyappcommons.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.pinnguino.mobyappcommons.dto.LocalityDTO;
import io.github.pinnguino.mobyappcommons.dto.ProvinceDTO;

@FeignClient(name = "georef")
public interface GeorefClient {

    // @GetMapping("/locations/provinces/{id}")
    // public ProvinceDTO getProvinceById(@PathVariable Long provinceId);
    @GetMapping("/locations/provinces/{id}")
    public ProvinceDTO getProvinceById(@PathVariable("id") Long provinceId);

    @GetMapping("/locations/localities/{id}")
    public LocalityDTO getLocalityById(@PathVariable("id") Long localityId); 

}
