package br.com.dnascto.projeto.charlie.repository;

import br.com.dnascto.projeto.charlie.core.Movimentation;
import br.com.dnascto.projeto.charlie.core.TransactionTypeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentationRepository extends MongoRepository<Movimentation, String> {

    Page<Movimentation> findAllByPersonID(String personID, Pageable pageable);
    Page<Movimentation> findTop10ByPersonID(String personID, Pageable pageable);
    Page<Movimentation> findTop100ByPersonID(String personID, Pageable pageable);
    Movimentation findTopByPersonIDAndTypeIs(String personID, TransactionTypeEnum typeEnum);

}