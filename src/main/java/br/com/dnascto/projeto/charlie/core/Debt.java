package br.com.dnascto.projeto.charlie.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "debt")
public class Debt {

    private String company;
    private double value;
    private LocalDateTime date;
    private boolean renegotiated;

}