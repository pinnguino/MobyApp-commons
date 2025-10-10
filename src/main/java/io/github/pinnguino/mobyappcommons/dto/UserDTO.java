package io.github.pinnguino.mobyappcommons.dto;

import java.time.LocalDate;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

   private String name;
    private String lastName;

    private String email;
    private String profilePicture;
    private Boolean asset;

    private LocalDate dateOfBirth;
    
    private String province;
    private String locality;
    
    private TechnologyDTO currentTech;
    private UserDTO referent;
    private UserDTO talentPartner;

    private LocalDate dateEntered;
    private String signatureUrl; 

    // Projects related
    private List<ProjectDTO> projects;

}
