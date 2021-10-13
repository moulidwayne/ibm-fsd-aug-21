package org.example.dao;

import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;

import java.util.List;

public interface CDDao {

    public CD createCD(CD cd);
    public List<SpecialEditionCD> displayAllSpecialEditionCD();
    public List<InternationalCD> displayAllInterNationalCD();
    public SpecialEditionCD findSpecialEditonCDById(Integer id);
    public InternationalCD findInternationalCDById(Integer id);

}
