package com.canerosman.controller.impl;

import com.canerosman.controller.IRestPersonelController;
import com.canerosman.model.Personel;
import com.canerosman.service.IPersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl implements IRestPersonelController {

    @Autowired
    private IPersonelService personelService;
    @GetMapping("/list/pageable")
    @Override
    public Page<Personel> findAllPageable(@RequestParam(value = "pageNumber") int pageNumber,
                                          @RequestParam(value = "pageSize") int pageSize) {
         Pageable pageable = PageRequest.of(pageNumber,pageSize, Sort.by(Sort.Direction.DESC,"id"));
        return personelService.findAllPageable(pageable);
    }
}
