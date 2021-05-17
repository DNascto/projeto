package br.com.dnascto.projeto.charlie.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movimentation")
public class Movimentation {

    @Id
    private String id;
    private String personID;
    private String originalCompany;
    private String receivingCompany;
    private Date date;
    private double value;
    private TransactionTypeEnum type;

}