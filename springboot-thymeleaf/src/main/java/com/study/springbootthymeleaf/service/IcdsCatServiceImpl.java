package com.study.springbootthymeleaf.service;

import com.study.springbootthymeleaf.model.IcdsCat;
import com.study.springbootthymeleaf.repository.IcdsCatRepository;
import com.study.springbootthymeleaf.service.api.IcdsCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IcdsCatServiceImpl implements IcdsCatService {
    @Autowired
    private IcdsCatRepository icdsCatRepository;

    @Override
    public IcdsCat save(IcdsCat icdsCat) {
        return icdsCatRepository.save(icdsCat);
    }

    @Override
    public List<IcdsCat> findList() {
        return icdsCatRepository.findAll();
    }

    @Override
    public void edit(IcdsCat icdsCat) {
        icdsCatRepository.save(icdsCat);
    }

    @Override
    public void delete(Integer catId) {
        icdsCatRepository.deleteById(catId);
    }

    @Override
    public IcdsCat findById(int catId) {
        return icdsCatRepository.findByCatId(catId);
    }

    @Override
    public IcdsCat add(IcdsCat icdsCat) {
        return icdsCatRepository.save(icdsCat);
    }
}
