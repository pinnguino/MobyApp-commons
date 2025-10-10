package io.github.pinnguino.mobyappcommons.airtable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRecord {
    @JsonProperty("Nombre")
    private String name;

    @JsonProperty("Apellido")
    private String lastName;

    @JsonProperty("Correo Moby")
    private String correoMoby;

    @JsonProperty("Fecha de Alta")
    private String entryDate;

    @JsonProperty("Foto de Perfil URL")
    private String profilePicture;

    @JsonProperty("Es Referente?")
    private Boolean isReferent;

    @JsonProperty("Es Talent Partner?")
    private Boolean isTalentPartner;

    @JsonProperty("Firma URL")
    private String signatureURL;

    @JsonProperty("Localidad")
    private String locality;

    @JsonProperty("Provincia")
    private String province;

    @JsonProperty("Proyectos")
    private List<String> projects;

    @JsonProperty("Referente")
    private String referent;

    @JsonProperty("Tecnología Actual")
    private String currentTech;

    // Methods for checking if the user is talentPartner/Referent
    public boolean isTalentPartner() {
        return isTalentPartner;
    }

    public boolean isReferent() {
        return isReferent;
    }

}
