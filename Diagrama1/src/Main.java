import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static Object LancamentoVenda;
    private static List<Cliente> Clientes = new ArrayList<Cliente>();

    public static void main(String args[]){


        Cadastrar_Cliente("Cícero", "000.000.000-00", 10);
        Cadastrar_Cliente("Ana", "000.000.000-00", 10);
        Cadastrar_Cliente("Weslley", "000.000.000-00", 20);
        Cadastrar_Cliente("Renan", "000.000.000-00", 20);

        Venda venda1Cicero = new Venda(0, 1, 300.00, Clientes.get(0));
        Venda venda2Cicero = new Venda(1, 3, 600.00, Clientes.get(0));

        Venda venda1Ana = new Venda(2, 1, 300.00, Clientes.get(1));
        Venda venda2Ana = new Venda(3, 2, 500.00, Clientes.get(1));

        Venda venda1Weslley = new Venda(4, 1, 420.00, Clientes.get(2));
        Venda venda2Weslley = new Venda(5, 6, 1000.00, Clientes.get(2));

        Venda venda1Renan = new Venda(6, 1, 350.00, Clientes.get(3));
        Venda venda2Renan = new Venda(7, 12, 2500.00, Clientes.get(3));

    }

    public static void Cadastrar_Cliente(String nome, String cpf, int diaVencimento){
        int id = Clientes.size();
        Cliente cliente = new Cliente(id, nome, cpf, diaVencimento);
        Clientes.add(cliente);
    }

    public static List<LancamentoVenda> Retorna_Lancamentos(List<Cliente> clientes, int mes) throws ParseException {
        List<LancamentoVenda> lancamentosMes = new ArrayList<LancamentoVenda>();

        for(int i = 0; i < clientes.size(); i++){
            for(int j = 0; j < clientes.get(i).getVendasCliente().size(); j++){

                final List<LancamentoVenda> lancamentosVendaCliente =
                        clientes.get(i).getVendasCliente().get(j).getLancamentosVenda();

                for(int k = 0; k < lancamentosVendaCliente.size(); k++){
                    LancamentoVenda lancamento = lancamentosVendaCliente.get(k);
                    String vencimento = lancamento.getDataVencimento();
                    Date vencimentoData = new SimpleDateFormat("dd MM yyyy").parse(vencimento);
                    Calendar c = Calendar.getInstance();
                    c.setTime(vencimentoData);

                    if(c.get(Calendar.MONTH) == mes){
                        lancamentosMes.add(lancamento);
                    }
                }
            }
        }
        return lancamentosMes;
        //fim-Retorna_Lancamentos
    }

    public static List<Venda> Retorna_Vendas_Dia(List<Cliente> clientes, int dia) {
        List<Venda> vendasDia = new ArrayList<Venda>();

        for(int i = 0; i < clientes.size(); i++){

            if(clientes.get(i).getDiaVencimento() == dia) {
                for (int j = 0; j < clientes.get(i).getVendasCliente().size(); j++) {
                    final Venda venda = clientes.get(i).getVendasCliente().get(j);
                    vendasDia.add(venda);
                }
            }
        }
        return vendasDia;
        //fim-Retorna_Vendas
    }

    public static final void print(String mensagem){
        System.out.println(mensagem);
    }
}

