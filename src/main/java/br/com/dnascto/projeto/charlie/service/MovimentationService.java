package br.com.dnascto.projeto.charlie.service;

import br.com.dnascto.projeto.charlie.core.Movimentation;
import org.springframework.data.domain.Page;

import java.util.Date;

public interface MovimentationService {

    String newMovimentation(Movimentation movimentation);

    Date lastSearch(String personID);

    Page<Movimentation> findAllMovimentations(String personID);

    Page<Movimentation> findLastTenMovimentations(String personID);

    Page<Movimentation> findLastHundredMovimentations(String personID);
}
