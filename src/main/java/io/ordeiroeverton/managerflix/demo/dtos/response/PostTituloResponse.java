package io.ordeiroeverton.managerflix.demo.dtos.response;

public class PostTituloResponse {
    
    private Long tituloCadastrado;
    private String mensagem;
    
    public Long getTituloCadastrado() {
        return tituloCadastrado;
    }
    public void setTituloCadastrado(Long tituloCadastrado) {
        this.tituloCadastrado = tituloCadastrado;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    
}
