package com.canerosman.repository;

import com.canerosman.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Long> {
    @Query(value = "SELECT p FROM Personel p") // Ana sorgu
    //@Query(value = "from Personel")
    Page<Personel> findAllPageable(Pageable pageable);
}
