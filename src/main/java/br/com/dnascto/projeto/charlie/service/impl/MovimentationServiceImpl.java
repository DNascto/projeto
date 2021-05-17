package br.com.dnascto.projeto.charlie.service.impl;

import br.com.dnascto.projeto.charlie.core.Movimentation;
import br.com.dnascto.projeto.charlie.core.TransactionTypeEnum;
import br.com.dnascto.projeto.charlie.repository.MovimentationRepository;
import br.com.dnascto.projeto.charlie.service.MovimentationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class MovimentationServiceImpl implements MovimentationService {

    private final MovimentationRepository movimentationRepository;
    private final static PageRequest PAGENATION = PageRequest.of(0, 10);

    public String newMovimentation(Movimentation movimentation) {
        return movimentationRepository.save(movimentation).getId();
    }

    @Override
    public Date lastSearch(String personID) {
        return movimentationRepository.findTopByPersonIDAndTypeIs(personID, TransactionTypeEnum.CREDIT_CARD).getDate();
    }

    @Override
    public Page<Movimentation> findAllMovimentations(String personID) {
        return movimentationRepository.findAllByPersonID(personID, PAGENATION);
    }

    @Override
    public Page<Movimentation> findLastTenMovimentations(String personID) {
        return movimentationRepository.findTop10ByPersonID(personID, PAGENATION);
    }

    @Override
    public Page<Movimentation> findLastHundredMovimentations(String personID) {
        return movimentationRepository.findTop100ByPersonID(personID, PAGENATION);
    }
}