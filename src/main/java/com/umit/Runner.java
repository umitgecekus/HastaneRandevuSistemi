package com.umit;

import com.umit.service.DoktorService;
import com.umit.service.HastaService;

public class Runner {
    public static void main(String[] args) {
    new HastaService().hastaninRandevulari(1L);
    new HastaService().adiVerilenHastaninRandevulari();

    new DoktorService().branstaGorevYapanDoktorlar(2L);
    new DoktorService().doktorunHastaSayisi(1L);


    }
}
