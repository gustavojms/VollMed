package com.api.vollmed.medico.dto;

import lombok.Data;

@Data
public class EnderecoDTO {

    private String logradouro;

    private String bairro;

    private String cep;

    private String numero;

    private String complemento;

    private String cidade;

    private String estado;
}
