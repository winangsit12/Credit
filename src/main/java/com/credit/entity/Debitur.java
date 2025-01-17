package com.credit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Debitur")
public class Debitur{
    @Id
    @Column(name = "KodeDebitur")
    private String kodeDebitur;

    @Column(name = "NamaDepan")
    private String namaDepan;

    @Column(name = "NamaTengah")
    private String namaTengah;

    @Column(name = "NamaBelakang")
    private String namaBelakang;

    @Column(name = "Status")
    private Boolean statusDebitur;

    @Column(name = "NomorKontrakLama")
    private String nomorKontrakLama;

    @OneToMany(mappedBy = "debitur")
    private List<Survei> listSurvei;
}
