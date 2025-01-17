package com.credit.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "KofirmasiPencairan")
public class KonfirmasiPencairan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKonfirmasi")
    private Integer idKonfirmasi;

    @Column(name = "IdPersetujuan")
    private Integer idPersetujuan;

    @Column(name = "TanggalCair")
    private LocalDate tanggalCair;

    @Column(name = "TanggalMulaiBayarAngsuran")
    private LocalDate tanggalMulaiBayar;

    @Column(name = "NomorKartuAnggota")
    private String nomorKartuAnggota;

    @Column(name = "Komentar")
    private String komentar;

    @ManyToOne
    @JoinColumn(name = "IdPersetujuan", updatable = false, insertable = false)
    private Persetujuan persetujuan;

    @OneToMany(mappedBy = "konfirmasi")
    private List<Pencairan> listPencairan;
}
