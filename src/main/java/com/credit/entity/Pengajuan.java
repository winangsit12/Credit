package com.credit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Pengajuan")
public class Pengajuan {
    @Id
    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "TanggalPengajuan")
    private LocalDate tanggalPengajuan;

    @Column(name = "Subjek")
    private String subjek;

    @Column(name = "TotalPencairan")
    private BigDecimal totalPencairan;

    @Column(name = "Scoring")
    private Double scoring;

    @Column(name = "RatioKapasitas")
    private Double ratioKapasitas;

    @Column(name = "StatusPefindo")
    private String statusPefindo;

    @OneToOne
    @JoinColumn(name = "pengajuanSurvei")
    private Survei survei;

    @OneToOne(mappedBy = "pengajuan")
    private Persetujuan persetujuan;

    @OneToMany(mappedBy = "pengajuanNonStandar")
    private List<NonStandar> listNonStandar;

    @OneToMany(mappedBy = "pengajuanBanding")
    private List<Banding> listBanding;
}
