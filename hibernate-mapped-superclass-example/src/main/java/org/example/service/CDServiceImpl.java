package org.example.service;

import org.example.dao.CDDao;
import org.example.dao.CDDaoImpl;
import org.example.model.CD;

public class CDServiceImpl implements CDService{

    private CDDao cdDao;

    public CDServiceImpl() {
        cdDao=new CDDaoImpl();
    }

    @Override
    public CD createSpecialCD(CD cd) {
        return cdDao.createSpecialCD(cd);
    }
}
