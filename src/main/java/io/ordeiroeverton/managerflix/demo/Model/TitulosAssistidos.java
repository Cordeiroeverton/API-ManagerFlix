package io.ordeiroeverton.managerflix.demo.Model;

public class TitulosAssistidos {
    
    private Integer id;
    private Assistindo PkIdAssistindo;

    TitulosAssistidos(){

    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Assistindo getPkIdAssistindo() {
        return PkIdAssistindo;
    }
    public void setPkIdAssistindo(Assistindo pkIdAssistindo) {
        PkIdAssistindo = pkIdAssistindo;
    }

    

}
