package com.credit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "Persetujuan")
public class Persetujuan {
    @Id
    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "Keputusan")
    private Boolean keputusan;

    @Column(name = "Alasan")
    private String alasan;

    @OneToOne
    @JoinColumn(name = "PersetujuanPengajuan")
    private Pengajuan pengajuan;

    @OneToMany(mappedBy = "persetujuan")
    private List<Pencairan> listPencairan;
}
