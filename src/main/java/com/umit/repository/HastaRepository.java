package com.umit.repository;

import com.umit.entity.Hasta;

public class HastaRepository extends RepositoryManager<Hasta,Long>{
    public HastaRepository(){
        super(new Hasta());
    }
}
