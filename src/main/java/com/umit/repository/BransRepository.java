package com.umit.repository;

import com.umit.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long>{
    public BransRepository(){
        super(new Brans());
    }
}
