package com.uber.entityService.entityService.models;

import com.uber.entityService.entityService.enums.CarType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car extends BaseModel {

    @Column(unique = true, nullable = false)
    private String plateNumber;

    private String brand;

    private String model;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    @OneToOne
    private Driver driver;

    @ManyToOne
    private Color color;
}
