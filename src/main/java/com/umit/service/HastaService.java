package com.umit.service;

import com.umit.entity.Hasta;
import com.umit.entity.Randevu;
import com.umit.repository.BransRepository;
import com.umit.repository.DoktorRepository;
import com.umit.repository.HastaRepository;
import com.umit.repository.RandevuRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class HastaService {
    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;


    public HastaService(){
        this.bransRepository = new BransRepository();
        this.doktorRepository = new DoktorRepository();
        this.hastaRepository = new HastaRepository();
        this.randevuRepository = new RandevuRepository();

    }


    public void hastaninRandevulari(Long id){
        Optional<Hasta> hasta = hastaRepository.findById(id);
        hasta.ifPresent(h->{
            System.out.println("  Hasta Bilgisi  ");
            System.out.println(h);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("hastaid",h.getId());
            randevuList.forEach(randevu->{
                System.out.println("  Randevular  ");
                System.out.println(randevu);
                System.out.println();
            });

        });

    }

    public void adiVerilenHastaninRandevulari(){
        System.out.println("Lütfen randevularini gormek istediginiz hastanin adini soyadini giriniz.");
        String name = new Scanner(System.in).nextLine();
        Stream<Long> id = hastaRepository.findByColumnAndValue("ad", name).stream().map(Hasta::getId);
        Optional<Hasta> hasta = hastaRepository.findById(id.count());
        hasta.ifPresent(h->{
            System.out.println("*** Hasta Bilgisi ***");
            System.out.println(h);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("hastaid",h.getId());
            randevuList.forEach(randevu->{
                System.out.println("--- Randevular ---");
                System.out.println(randevu);
                System.out.println();
            });

        });

    }


}
