package org.example.service;

import org.example.dao.CDDao;
import org.example.dao.CDDaoImpl;
import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;

import java.util.List;

public class CDServiceImpl implements CDService{

    private CDDao cdDao;

    public CDServiceImpl() {
        cdDao=new CDDaoImpl();
    }

    @Override
    public CD createCD(CD cd) {
        return cdDao.createCD(cd);
    }

    @Override
    public List<SpecialEditionCD> displayAllSpecialEditionCD() {
        return cdDao.displayAllSpecialEditionCD();
    }

    @Override
    public List<InternationalCD> displayAllInterNationalCD() {
        return cdDao.displayAllInterNationalCD();
    }

    @Override
    public SpecialEditionCD findSpecialEditonCDById(Integer id) {
        return cdDao.findSpecialEditonCDById(id);
    }

    @Override
    public InternationalCD findInternationalCDById(Integer id) {
        return cdDao.findInternationalCDById(id);
    }
}
