package com.fit2planet.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "package")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Package {

    private int packageId;

//    private time activatedTime;
//
//    private date activatedDate;

}
