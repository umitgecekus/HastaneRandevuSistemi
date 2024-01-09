package com.umit.repository;

import com.umit.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long>{
    public RandevuRepository(){
        super(new Randevu());
    }
}
