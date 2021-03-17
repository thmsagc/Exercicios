import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    private static Object LancamentoVenda;

    public static void main(String args[]){

        Cliente Cicero = new Cliente(0, "Cícero", "000.000.000-00", 17);
        Cliente Ana = new Cliente(1, "Ana", "000.000.000-00", 1);
        Cliente Weslley = new Cliente(2, "Weslley", "000.000.000-00", 1);
        Cliente Renan = new Cliente(3, "Renan", "000.000.000-00", 1);

        Venda venda1 = new Venda(0, 3, 300.00, Cicero);

        gerarLancamentos(venda1);
        imprimirLancamentos(venda1);
    }

    public static void gerarLancamentos(Venda venda){

        List<LancamentoVenda> lancamentos = new ArrayList<LancamentoVenda>();;

        double valorParcela = venda.getValorTotal()/ venda.getQuantidadeParcelas();

        Calendar c = Calendar.getInstance();
        Date d = new Date();
        c.setTime(d);
        int diaAtual = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, venda.getClienteVenda().getDiaVencimento());

        if(venda.getClienteVenda().getDiaVencimento() > diaAtual) {
            c.add(Calendar.MONTH, 1);
        }

        for(int i = 0; i < venda.getQuantidadeParcelas(); i++){
            SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
            String formatedData = format1.format(c.getTime());
            LancamentoVenda = new LancamentoVenda(0, valorParcela, i+1, formatedData, venda);
            lancamentos.add((LancamentoVenda) LancamentoVenda);
            c.add(Calendar.MONTH, 1);
        }
        venda.setLancamentosVenda(lancamentos);
    }
    public static void imprimirLancamentos(Venda venda){
        for(int i = 0; i < venda.getLancamentosVenda().size(); i++){
            System.out.println("\n");
            System.out.println(venda.getLancamentosVenda().get(i).getNumeroParcela());
            System.out.println(venda.getLancamentosVenda().get(i).getValor());
            System.out.println(venda.getLancamentosVenda().get(i).getDataVencimento());
        }
    }
    public static void print(String mensagem){
        System.out.println(mensagem);
    }
}

