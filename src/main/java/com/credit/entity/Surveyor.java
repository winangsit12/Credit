package com.credit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Surveyor")
public class Surveyor {
    @Id
    @Column(name = "KodeSurveyor")
    private String kodeSurveyor;

    @Column(name = "NamaDepan")
    private String namaDepan;

    @Column(name = "NamaTengah")
    private String namaTengah;

    @Column(name = "NamaBelakang")
    private String namaBelakang;

    @Column(name = "Jabatan")
    private String jabatan;

    @Column(name = "Cabang")
    private String cabang;

    @OneToMany(mappedBy = "surveyor")
    private List<Survei> listSurvei;
}
