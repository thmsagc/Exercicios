import java.util.Calendar;

public class LancamentoVenda {
    private int id;
    private double valor;
    private int numeroParcela;
    private String dataVencimento;
    private Venda venda;

    public LancamentoVenda(int id, double valor, int numeroParcela, String dataVencimento, Venda venda){
        this.id = id;
        this.valor = valor;
        this.numeroParcela = numeroParcela;
        this.dataVencimento = dataVencimento;
        this.venda = venda;
    }

    /*
    This method is used do get the value of the attribute id
    @return id the attribute id value from object
     */
    public int getId() {
        return id;
    }

    /*
    This method is used do get the value of the attribute valor
    @return valor the attribute valor value from object
     */
    public double getValor() {
        return valor;
    }

    /*
    This method is used do get the value of the attribute numeroParcela
    @return numeroParcela the attribute numeroParcela value from object
     */
    public int getNumeroParcela() {
        return numeroParcela;
    }

    /*
    This method is used do get the value of the attribute dataVencimento
    @return dataVencimento the attribute dataVencimento value from object
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /*
    This method is used do set the value of the attribute id
    @param id the new value for the attribute id from object
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
    This method is used do set the value of the attribute valor
    @param valor the new value for the attribute valor from object
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /*
    This method is used do set the value of the attribute numeroParcela
    @param numeroParcela the new value for the attribute numeroParcela from object
     */
    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    /*
    This method is used do set the value of the attribute dataVencimento
    @param dataVencimento the new value for the attribute dataVencimento from object
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
