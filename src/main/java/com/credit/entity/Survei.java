package com.credit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Survei")
public class Survei {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSurvei")
    private Integer idSurvei;

    @Column(name = "NomorKontrak")
    private String nomorKontrak;

    @Column(name = "NomorKontrakLama")
    private String nomorKontrakLama;

    @Column(name = "StatusDebitur")
    private String statusDebitur;

    @Column(name = "NamaDepanDebitur")
    private String namaDepanDebitur;

    @Column(name = "NamaTengahDebitur")
    private String namaTengahDebitur;

    @Column(name = "NamaAkhirDebitur")
    private String namaAkhirDebitur;

    @Column(name = "NilaiHargaPasar")
    private BigDecimal nilaiHargaPasar;

    @Column(name = "NilaiPelepasanSparepart")
    private BigDecimal nilaiPelepasanSparepart;

    @Column(name = "NilaiPenambahanSparepart")
    private BigDecimal nilaiPenambahanSparepart;

    @Column(name = "NilaiTaksasi")
    private BigDecimal nilaiTaksasi;

    @Column(name = "PeringkatDebitur")
    private String peringkatDebitur;

    @Column(name = "LTVMaksimalPencairan")
    private Double lTVMaksimal;

    @Column(name = "NilaiPencairan")
    private BigDecimal nilaiPencairan;

    @Column(name = "NilaiBungaBerjalan")
    private BigDecimal nilaiBungaBerjalan;

    @Column(name = "BiayaKartuAnggota")
    private BigDecimal biayaKartuAnggota;

    @Column(name = "SisaHutangKontrakLama")
    private BigDecimal sisaHutangKontralLama;

    @Column(name = "SisaNilaiPencairan")
    private BigDecimal sisaNilaiPencairan;

    @Column(name = "PeriodePembayaran")
    private String periodePembayaran;

    @Column(name = "Tenor")
    private Integer tenor;

    @Column(name = "NilaiAngsuran")
    private BigDecimal nilaiAngsuran;

    @Column(name = "JenisAngsuran")
    private String jenisAngsuran;

    @Column(name = "CaraPencairan")
    private String caraPencairan;

    @Column(name = "NomorRekening")
    private String nomorRekening;

    @Column(name = "Bank")
    private String namaBank;

    @Column(name = "Banding")
    private Boolean banding;

    @Column(name = "Standar")
    private Boolean standar;

    @OneToMany(mappedBy = "survei")
    private List<Persetujuan> listPersetujuan;
}
