import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private int QuantidadeParcelas;
    private double ValorTotal;
    private Cliente clienteVenda;
    private List<LancamentoVenda> lancamentosVenda = new ArrayList<LancamentoVenda>();
    /*
    This method is the constructor of class Venda
     */
    public Venda(int id, int QuantidadeParcelas, double ValorTotal, Cliente clienteVenda){
        this.id = id;
        this.QuantidadeParcelas = QuantidadeParcelas;
        this.ValorTotal = ValorTotal;
        this.clienteVenda = clienteVenda;
    }

    /*
    This method is used do get the value of the attribute id
    @return id the attribute id value from object
     */
    public int getId() {
        return this.id;
    }

    /*
    This method is used do get the value of the attribute QuantidadeParcelas
    @return QuantidadeParcelas the attribute QuantidadeParcelas value from object
     */
    public int getQuantidadeParcelas() {
        return this.QuantidadeParcelas;
    }

    /*
    This method is used do get the value of the attribute ValorTotal
    @return ValorTotal the attribute ValorTotal value from object
     */
    public double getValorTotal() {
        return this.ValorTotal;
    }

    /*
    This method is used do get the value of the attribute lancamentosVenda
    @return lancamentosVenda the attribute lancamentosVenda value from object
     */
    public List<LancamentoVenda> getLancamentosVenda(){
        return this.lancamentosVenda;
    }
    /*
   This method is used do set the value of the attribute clienteVenda
   @param clienteVenda the new value for the attribute clienteVenda from object
    */
    public Cliente getClienteVenda() {
        return this.clienteVenda;
    }

    /*
        This method is used do set the value of the attribute id
        @param id the new value for the attribute id from object
         */
    public void setId(int id) {
        this.id = id;
    }

    /*
    This method is used do set the value of the attribute quantidadeParcelas
    @param QuantidadeParcelas the new value for the attribute quantidadeParcelas from object
     */
    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.QuantidadeParcelas = quantidadeParcelas;
    }

    /*
    This method is used do set the value of the attribute valorTotal
    @param valorTotal the new value for the attribute id from object
     */
    public void setValorTotal(float valorTotal) {
        this.ValorTotal = valorTotal;
    }

    /*
    This method is used do set the value of the attribute valorTotal
    @param valorTotal the new value for the attribute id from object
     */
    public void setLancamentosVenda(List<LancamentoVenda> lancamentosVenda) {
        this.lancamentosVenda = lancamentosVenda;
    }

    /*
    This method is used do set the value of the attribute clienteVenda
    @param clienteVenda the new value for the attribute clienteVenda from object
     */
    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }
}
