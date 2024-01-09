package com.umit.repository;

import com.umit.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long>{
    public DoktorRepository(){
        super(new Doktor());
    }
}
