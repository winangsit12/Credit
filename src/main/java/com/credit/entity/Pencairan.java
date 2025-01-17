package com.credit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Pencairan")
public class Pencairan {
    @Id
    @Column(name = "NomorKontrak")
    private String nomorKontrak;

    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "TanggalCair")
    private LocalDate tanggalCair;

    @Column(name = "TanggalBayar")
    private LocalDate tanggalBayar;

    @Column(name = "KartuAnggota")
    private String kartuAnggota;

    @Column(name = "Komentar")
    private String komentar;

    @Column(name = "Status")
    private String status;

    @Column(name = "Alasan")
    private String alasan;

    @ManyToOne
    @JoinColumn(name = "NomorAplikasi", insertable = false, updatable = false)
    private Persetujuan persetujuan;
}
