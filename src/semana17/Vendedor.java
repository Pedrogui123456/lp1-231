package semana17;

public class Vendedor {
    private String nome;
    private double vendas;
    private double comissao;

    public Vendedor(String nome, double vendas, double comissao){
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double obterSalario() {
        return vendas * (comissao/100);
    }
}

public class Principal {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Pedro", 50000.00, 10.00);
        Vendedor v2 = new Vendedor("João", 100000.00, 12.00);
        System.out.println(v1.obterSalario());
        System.out.println(v2.obterSalario());
    }
}
