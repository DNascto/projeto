package br.com.dnascto.projeto.charlie.core;

public enum TransactionTypeEnum {

    CREDIT_CARD("C"), DEBIT_CARD("D"), TRANFER("T");

    public String type;

    TransactionTypeEnum(String type) {
        this.type = type;
    }
}