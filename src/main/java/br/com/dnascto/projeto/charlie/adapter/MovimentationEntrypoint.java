package br.com.dnascto.projeto.charlie.adapter;

import br.com.dnascto.projeto.charlie.core.Movimentation;
import br.com.dnascto.projeto.charlie.service.MovimentationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RestController
@RequiredArgsConstructor
public class MovimentationEntrypoint {

    private final MovimentationService movimentationService;

    @PostMapping("/new_movimentation")
    public ResponseEntity<String> newRegister(@RequestBody Movimentation movimentation) {
        return ResponseEntity.ok(movimentationService.newMovimentation(movimentation));
    }

    @GetMapping("/last/search")
    public ResponseEntity<Date> lastSearch(@RequestParam String personID) {
        return ResponseEntity.ok(movimentationService.lastSearch(personID));
    }

    @GetMapping("/movimentations")
    public ResponseEntity<Page<Movimentation>> allMovimentations(@RequestParam String personID) {
        return ResponseEntity.ok(movimentationService.findAllMovimentations(personID));
    }

    @GetMapping("/movimentations/10")
    public ResponseEntity<Page<Movimentation>> lastTenMovimentations(@RequestParam String personID) {
        return ResponseEntity.ok(movimentationService.findLastTenMovimentations(personID));
    }

    @GetMapping("/movimentations/100")
    public ResponseEntity<Page<Movimentation>> lastHundredMovimentations(@RequestParam String personID) {
        return ResponseEntity.ok(movimentationService.findLastHundredMovimentations(personID));
    }

    @GetMapping("/last/purchase")
    public ResponseEntity<Date> lastPurchase(@RequestParam String personID) {
        return ResponseEntity.ok(movimentationService.lastSearch(personID));
    }
}