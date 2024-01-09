package com.umit.service;

import com.umit.entity.Brans;
import com.umit.entity.Doktor;
import com.umit.entity.Randevu;
import com.umit.repository.BransRepository;
import com.umit.repository.DoktorRepository;
import com.umit.repository.HastaRepository;
import com.umit.repository.RandevuRepository;

import java.util.List;
import java.util.Optional;

public class DoktorService {

    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;


    public DoktorService(){
        this.bransRepository = new BransRepository();
        this.doktorRepository = new DoktorRepository();
        this.hastaRepository = new HastaRepository();
        this.randevuRepository = new RandevuRepository();

    }
    public void doktorunHastaSayisi(Long id){
        Optional<Doktor> doktor = doktorRepository.findById(id);
        doktor.ifPresent(d->{
            System.out.println("Doktor INFO");
            System.out.println(d);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("doktorid",d.getId());
            randevuList.forEach(randevu -> {
                System.out.println("  RANDEVU BİLGİLERİ   ");
                System.out.println(randevu);
                System.out.println();
            });
            System.out.println();
            System.out.println("Doktorun Hasta Sayısı "+randevuList.size());

        });
    }

    public void branstaGorevYapanDoktorlar(Long id){
        Optional<Brans> brans = bransRepository.findById(id);
        brans.ifPresent(b->{
            System.out.println("  BRANS BİLGİLERİ   ");
            System.out.println(b);
            System.out.println();
            List<Doktor> doktorList = doktorRepository.findByColumnAndValue("bransid",b.getId());
            doktorList.forEach(doktor -> {
                System.out.println("    DOKTOR BILGILERI   ");
                System.out.println(doktor);
                System.out.println();

            });
        });
    }
}
