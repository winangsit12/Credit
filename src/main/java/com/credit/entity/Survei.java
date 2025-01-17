package com.credit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "Survei")
public class Survei {
    @Id
    @Column(name = "NomorAplikasi")
    private String nomorAplikasi;

    @Column(name = "KodeDebitur")
    private String kodeDebitur;

    @Column(name = "KodeSurveyor")
    private String kodeSurveyor;

    @Column(name = "NilaiHargaPasar")
    private BigDecimal nilaiHargaPasar;

    @Column(name = "NilaiPelepasanSparepart")
    private BigDecimal nilaiPelepasanSparepart;

    @Column(name = "NilaiPenambahanSparepart")
    private BigDecimal nilaiPenambahanSparepart;

    @Column(name = "NilaiTaksasi")
    private BigDecimal nilaiTaksasi;

    @Column(name = "PeringkatDebitur")
    private Boolean peringkatDebitur;

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
    private Boolean periodePembayaran;

    @Column(name = "Tenor")
    private Integer tenor;

    @Column(name = "NilaiAngsuran")
    private BigDecimal nilaiAngsuran;

    @Column(name = "AdvanceArrear")
    private Boolean jenisAngsuran;

    @Column(name = "CaraPencairan")
    private String caraPencairan;

    @Column(name = "NomorRekening")
    private String nomorRekening;

    @Column(name = "NamaRekening")
    private String namaRekening;

    @Column(name = "Bank")
    private String namaBank;

    @Column(name = "Produk")
    private String produk;

    @ManyToOne
    @JoinColumn(name = "KodeDebitur", insertable = false, updatable = false)
    private Debitur debitur;

    @ManyToOne
    @JoinColumn(name = "KodeSurveyor", insertable = false, updatable = false)
    private Surveyor surveyor;

    @OneToOne(mappedBy = "survei")
    private Pengajuan pengajuan;
}
