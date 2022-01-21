public class Assistindo {
    
    private  Integer id;
    private  Titulos PkIdTemporadaTitulo;
    private  Titulos PkIdEpsodioTitulo;
    private  Titulos PkIdDuracaoTitulo;
    private  Integer Status;
    private  Usuario PkIdUsuario;

    public Assistindo(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPkIdTemporadaTitulo() {
        return PkIdTemporadaTitulo;
    }
    public void setPkIdTemporadaTitulo(Integer pkIdTemporadaTitulo) {
        PkIdTemporadaTitulo = pkIdTemporadaTitulo;
    }
    public Integer getPkIdEpsodioTitulo() {
        return PkIdEpsodioTitulo;
    }
    public void setPkIdEpsodioTitulo(Integer pkIdEpsodioTitulo) {
        PkIdEpsodioTitulo = pkIdEpsodioTitulo;
    }
    public Integer getPkIdDuracaoTitulo() {
        return PkIdDuracaoTitulo;
    }
    public void setPkIdDuracaoTitulo(Integer pkIdDuracaoTitulo) {
        PkIdDuracaoTitulo = pkIdDuracaoTitulo;
    }
    public Integer getStatus() {
        return Status;
    }
    public void setStatus(Integer status) {
        Status = status;
    }
    public Integer getPkIdUsuario() {
        return PkIdUsuario;
    }
    public void setPkIdUsuario(Integer pkIdUsuario) {
        PkIdUsuario = pkIdUsuario;
    }

    
}
