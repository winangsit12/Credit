package com.credit.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Pencairan")
public class Pencairan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPencairan")
    private Integer idPencairan;

    @Column(name = "IdKonfirmasi")
    private Integer idKonfirmasi;

    @Column(name = "TanggalCair")
    private LocalDate tanggalCair;

    @Column(name = "TanggalMulaiBayarAngsuran")
    private LocalDate tanggalMulaiBayar;

    @Column(name = "Status")
    private String status;

    @Column(name = "Alasan")
    private String alasan;

    @Column(name = "Komentar")
    private String komentar;

    @ManyToOne
    @JoinColumn(name = "IdKonfirmasi", updatable = false, insertable = false)
    private KonfirmasiPencairan konfirmasi;
}
