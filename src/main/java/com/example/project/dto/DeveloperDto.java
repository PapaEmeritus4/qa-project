package com.example.project.dto;

import com.example.project.entity.DeveloperEntity;
import com.example.project.entity.Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class DeveloperDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String specialty;
    private Status status;

    public DeveloperEntity toEntity() {
        return DeveloperEntity.builder()
                .id(id)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .specialty(specialty)
                .status(status)
                .build();
    }

    public static DeveloperDto fromEntity(DeveloperEntity entity) {
        return DeveloperDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .specialty(entity.getSpecialty())
                .status(entity.getStatus())
                .build();
    }
}
