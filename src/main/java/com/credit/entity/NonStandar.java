package com.credit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "NonStandar")
public class NonStandar {
    @Id
    @Column(name = "IdNonStandar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNonStandar;

    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "Deskripsi")
    private String deskripsi;

    @ManyToOne
    @JoinColumn(name = "NomorAplikasi", updatable = false, insertable = false)
    private Pengajuan pengajuanNonStandar;
}
