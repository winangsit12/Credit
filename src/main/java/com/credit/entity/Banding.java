package com.credit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Banding")
public class Banding {
    @Id
    @Column(name = "IdBanding")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBanding;

    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "TanggalNaikBanding")
    private LocalDate tanggalNaikBanding;

    @Column(name = "Alasan")
    private String alasan;

    @ManyToOne
    @JoinColumn(name = "NomorAplikasi", insertable = false, updatable = false)
    private Pengajuan pengajuanBanding;
}
