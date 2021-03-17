import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private int QuantidadeParcelas;
    private double ValorTotal;
    private Cliente clienteVenda;
    private List<LancamentoVenda> lancamentosVenda = new ArrayList<LancamentoVenda>();
    /*
    This is the constructor of class Venda
     */
    public Venda(int id, int QuantidadeParcelas, double ValorTotal, Cliente clienteVenda){
        this.id = id;
        this.QuantidadeParcelas = QuantidadeParcelas;
        this.ValorTotal = ValorTotal;
        this.clienteVenda = clienteVenda;
        this.lancamentosVenda = gerarLancamentos();
        clienteVenda.addVendaCliente(this);
    }

    public List<LancamentoVenda> gerarLancamentos(){

        List<LancamentoVenda> lancamentos = new ArrayList<LancamentoVenda>();;

        double valorParcela = getValorTotal()/ getQuantidadeParcelas();

        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);
        int diaAtual = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, getClienteVenda().getDiaVencimento());

        if(getClienteVenda().getDiaVencimento() > diaAtual) {
            c.add(Calendar.MONTH, 1);
        }

        for(int i = 0; i < getQuantidadeParcelas(); i++){
            SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
            String formatedData = format1.format(c.getTime());
            LancamentoVenda lancamento = new LancamentoVenda(0, valorParcela, i+1, formatedData, this);
            lancamentos.add((LancamentoVenda) lancamento);
            c.add(Calendar.MONTH, 1);
        }
        return lancamentos;
    }
    public void imprimirLancamentos(){
        for(int i = 0; i < getLancamentosVenda().size(); i++){
            System.out.println("\n");
            System.out.println(getLancamentosVenda().get(i).getNumeroParcela());
            System.out.println(getLancamentosVenda().get(i).getValor());
            System.out.println(getLancamentosVenda().get(i).getDataVencimento());
        }
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
