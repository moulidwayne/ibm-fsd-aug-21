package org.example.service;

import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;

import java.util.List;

public interface CDService {
    public CD createCD(CD cd);
    public List<SpecialEditionCD> displayAllSpecialEditionCD();
    public List<InternationalCD> displayAllInterNationalCD();
    public SpecialEditionCD findSpecialEditonCDById(Integer id);
    public InternationalCD findInternationalCDById(Integer id);
}
