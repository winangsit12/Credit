package com.credit.repository;

import com.credit.entity.Pencairan;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PencairanRepository extends JpaRepository<Pencairan, Integer> {
    @Query(value = """
        SELECT Pencairan
        FROM Pencairan p
        """)
    List<Pencairan> getPencairanBy(String username, Pageable pageable);
}
