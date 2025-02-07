package com.canerosman.service;

import com.canerosman.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPersonelService {
    Page<Personel> findAllPageable(Pageable pageable);
}
