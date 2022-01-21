package io.ordeiroeverton.managerflix;

public class Titulos {
    
    private Integer id;
    private String  nome;
    private String  sinopse;
    private Integer temporadas;
    private String  epsodios;
    private double  duracao;
    private Usuarios PkIdUsuario;
    private Categoria PkIdCategoria;
    
    Titulos(){

    }

    public Categoria getPkIdCategoria() {
        return PkIdCategoria;
    }
    public void setPkIdCategoria(Categoria pkIdCategoria) {
        PkIdCategoria = pkIdCategoria;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public Integer getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }
    public String getEpsodios() {
        return epsodios;
    }
    public void setEpsodios(String epsodios) {
        this.epsodios = epsodios;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public Usuarios getPkIdUsuario() {
        return PkIdUsuario;
    }
    public void setPkIdUsuario(Usuarios pkIdUsuario) {
        PkIdUsuario = pkIdUsuario;
    }

}
