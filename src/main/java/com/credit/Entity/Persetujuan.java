package com.credit.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Persetujuan")
public class Persetujuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersetujuan")
    private Integer idPersetujuan;

    @Column(name = "IdSurvei")
    private Integer idSurvei;

    @Column(name = "Keputusan")
    private boolean keputusan;

    @Column(name = "Alasan")
    private String alasan;

    @ManyToOne
    @JoinColumn(name = "IdSurvei", insertable = false, updatable = false)
    private Survei survei;

    @OneToMany(mappedBy = "persetujuan")
    private List<KonfirmasiPencairan> listKonfirmasi;
}
