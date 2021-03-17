public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private int diaVencimento;

    /*
    This is the constructor of class Cliente
    */
    public Cliente(int id, String nome, String cpf, int diaVencimento){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.diaVencimento = diaVencimento;
    }

    /*
    This method is used do get the value of the attribute id
    @return id the attribute id value from object
     */
    public int getId() {
        return id;
    }

    /*
    This method is used do get the value of the attribute nome
    @return id the attribute nome value from object
     */
    public String getNome() {
        return nome;
    }

    /*
    This method is used do get the value of the attribute cpf
    @return cpf the attribute id value from object
     */
    public String getCpf() {
        return cpf;
    }

    /*
    This method is used do get the value of the attribute diaVencimento
    @return diaVencimento the attribute id value from object
     */
    public int getDiaVencimento() {
        return diaVencimento;
    }

    /*
    This method is used do set the value of the attribute id
    @param id the new value for the attribute id from object
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
    This method is used do set the value of the attribute nome
    @param nome the new value for the attribute id from object
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    This method is used do set the value of the attribute cpf
    @param cpf the new value for the attribute id from object
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*
    This method is used do set the value of the attribute diaVencimento
    @param diaVencimento the new value for the attribute id from object
     */
    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
}
