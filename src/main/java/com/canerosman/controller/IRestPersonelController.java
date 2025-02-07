package com.canerosman.controller;

import com.canerosman.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRestPersonelController {
    public Page<Personel> findAllPageable(int pageNumber,int pageSize);
}
