package io.github.pinnguino.mobyappcommons.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectDTO {

    private String name;
    private String description;
    private String client;

    private LocalDate creationDate;
    private LocalDate closingDate;
    
    private String state;

}
