import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private int diaVencimento;
    private List<Venda> vendasCliente = new ArrayList<Venda>();
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
    This method is used to add a object venda to the attribute the vendasCliente from object
    @param venda the object of type Venda that want to add in the array vendasCliente
     */
    public void addVendaCliente(Venda venda) {
        vendasCliente.add(venda);
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
    This method is used do get the value of the attribute vendasCliente
    @return vendasCliente the attribute vendasCliente value from object
     */
    public List<Venda> getVendasCliente() {
        return vendasCliente;
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

    /*
    This method is used do set the value of the attribute vendasCliente
    @param vendasCliente the new value for the attribute vendasCliente from object
     */
    public void setVendasCliente(List<Venda> vendasCliente) {
        this.vendasCliente = vendasCliente;
    }
}
