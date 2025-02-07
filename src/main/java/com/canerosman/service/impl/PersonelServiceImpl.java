package com.canerosman.service.impl;

import com.canerosman.model.Personel;
import com.canerosman.repository.PersonelRepository;
import com.canerosman.service.IPersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonelServiceImpl implements IPersonelService {
    @Autowired
    private PersonelRepository personelRepository;
    @Override
    public Page<Personel> findAllPageable(Pageable pageable) {
        return personelRepository.findAllPageable(pageable);
    }
}
