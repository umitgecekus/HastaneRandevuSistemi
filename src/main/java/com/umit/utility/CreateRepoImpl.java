package com.umit.utility;

import com.umit.entity.Brans;
import com.umit.entity.Doktor;
import com.umit.entity.Hasta;
import com.umit.entity.Randevu;
import com.umit.repository.BransRepository;
import com.umit.repository.DoktorRepository;
import com.umit.repository.HastaRepository;
import com.umit.repository.RandevuRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class CreateRepoImpl {
    private final RandevuRepository randevuRepository;
    private final HastaRepository hastaRepository;
    private final DoktorRepository doktorRepository;
    private final BransRepository bransRepository;
    public CreateRepoImpl(){
        this.bransRepository = new BransRepository();
        this.randevuRepository = new RandevuRepository();
        this.hastaRepository = new HastaRepository();
        this.doktorRepository = new DoktorRepository();
    }

    public void  createDemoData(){
        createBrans();
        createDoktor();
        createHasta();
        createRandevu();
    }

    private void createBrans(){
        bransRepository.save(Brans.builder()
                .ad("Acil Servis")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Kardiyoloji")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Ortopedi")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Goz Hastaliklari")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Kulak Burun Bogaz")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Radyoloji")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Noroloji")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Kadin Hastaliklari")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Genel Cerrahi")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Psikiytri")
                .build());

    }

    private void createDoktor(){
        doktorRepository.save(Doktor.builder()
                .ad("Umit Gecekus")
                .telefon("0 555 555 5555")
                .bransid(1L)
                .unvan("Op. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Sule Tas")
                .telefon("0 555 444 4444")
                .bransid(2L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Ozge Tas")
                .telefon("0 555 333 3333")
                .bransid(3L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Asya Yilmaz")
                .telefon("0 555 222 2222")
                .bransid(4L)
                .unvan("Op. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Gulce Polat")
                .telefon("0 555 111 2237")
                .bransid(5L)
                .unvan("Doc. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Beyza Bas")
                .telefon("0 555 111 1111")
                .bransid(6L)
                .unvan("Op. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Sevgi Yildirim")
                .telefon("0 555 999 9999")
                .bransid(7L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Zeynep Care")
                .telefon("0 555 888 8888")
                .bransid(8L)
                .unvan("Pr. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Sena Kus")
                .telefon("0 555 777 7777")
                .bransid(9L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Tugce Kaya")
                .telefon("0 555 666 6666")
                .bransid(10L)
                .unvan("Pr. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Sule Gonul")
                .telefon("0 555 222 3456")
                .bransid(11L)
                .unvan("Prt.Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Lale Dev")
                .telefon("0 555 234 5678")
                .bransid(10L)
                .unvan("Uz. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Rana Dilek")
                .telefon("0 555 987 6543")
                .bransid(9L)
                .unvan("Doc. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Buse Caymaz")
                .telefon("0 555 636 6363")
                .bransid(8L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Seyma Dilek")
                .telefon("0 555 525 5252")
                .bransid(7L)
                .unvan("Doc. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Ilayda Tuna")
                .telefon("0 555 858 8585")
                .bransid(6L)
                .unvan("Prf. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Gulsum Mavi")
                .telefon("0 555 747 7474")
                .bransid(5L)
                .unvan("Tkn. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Pinar Kor")
                .telefon("0 555 252 5252")
                .bransid(4L)
                .unvan("Uz. Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Meltem GUMUSCU")
                .telefon("0 555 885 1212")
                .bransid(3L)
                .unvan("Uz. Dr.")
                .build());
    }

    private void createHasta(){
        hastaRepository.save(Hasta.builder()
                .ad("Ugur Gecekus")
                .telefon("0 555 222 3311")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ali Gecekus")
                .telefon("0 555 121 1111")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Mehmet Gecekus")
                .telefon("0 555 858 8523")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Tuna Gecekus")
                .telefon("0 555 222 5656")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ufuk Gecekus")
                .telefon("0 555 444 4444")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Umut Gecekus")
                .telefon("0 555 555 5555")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Utku Gecekus")
                .telefon("0 555 221 3311")
                .adres("Denizli")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ahmet Goz")
                .telefon("0 555 111 3442")
                .adres("Antalya")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Yesim Goz")
                .telefon("0 555 121 3442")
                .adres("Antalya")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Beyza Goz")
                .telefon("0 555 181 3442")
                .adres("Antalya")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Suna Goz")
                .telefon("0 555 191 3442")
                .adres("Antalya")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ilyas Goz")
                .telefon("0 555 111 3542")
                .adres("Antalya")
                .build());

        hastaRepository.save(Hasta.builder()
                .ad("Veli Ay")
                .telefon("0 554 222 3323")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ceren Ay")
                .telefon("0 554 222 3323")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Buse Ay")
                .telefon("0 554 666 3323")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Musa Ay")
                .telefon("0 554 266 3323")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Deniz Ay")
                .telefon("0 554 262 3323")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hulya Gece")
                .telefon("0 555 222 9499")
                .adres("Manisa")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Buray Gece")
                .telefon("0 555 222 9599")
                .adres("Manisa")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Beren Gece")
                .telefon("0 555 222 9699")
                .adres("Manisa")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Beril Gece")
                .telefon("0 555 222 9899")
                .adres("Manisa")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hulya Gece")
                .telefon("0 555 222 9799")
                .adres("Manisa")
                .build());

        hastaRepository.save(Hasta.builder()
                .ad("Ferdi Tayfur")
                .telefon("0 555 223 3333")
                .adres("Mugla")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Orhan Genc")
                .telefon("0 555 223 3534")
                .adres("Ankara")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Muslum Ses")
                .telefon("0 544 244 3445")
                .adres("Istanbul")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Sema Ses")
                .telefon("0 555 205 7235")
                .adres("Istanbul")
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Seda Ses")
                .telefon("0 555 707 5912")
                .adres("Istanbul")
                .build());

    }
    private void createRandevu(){
        Random random = new Random();
        LocalDate baslangicTarihi = LocalDate.of(2023, 1, 1);
        LocalDate bitisTarihi = LocalDate.of(2023, 12, 31);

        LocalTime baslangicSaat = LocalTime.of(9, 0);
        LocalTime bitisSaat = LocalTime.of(16, 0);

        for (int i = 0; i < 200; i++) { // 200 randevu
            randevuRepository.save(Randevu.builder()
                    .doktorid(random.nextLong(1,20))
                    .hastaid(random.nextLong(1,30))
                    .build());
        }

    }
}
