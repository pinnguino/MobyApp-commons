package io.github.pinnguino.mobyappcommons.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.pinnguino.mobyappcommons.dto.ProjectDTO;

@FeignClient(name = "project")
public interface ProjectClient {

    @GetMapping("/project/{id}")
    public ProjectDTO findProjectById(@PathVariable Long id);

}
