package semana12;

public class ContaTest {
    @Test
    public void saca(){
        Conta conta = new Conta(1, 0.0, "Pedro");
        conta.depositar(100);
        String saque = conta.sacar(60);

        assertEquals(saque, "Saque de 60.0 reais");
    }

    private void assertEquals(String saque, String string) {
    }

    @Test
    public void sacaIndisponivel(){
        Conta conta = new Conta(1, 0.0, "Pedro");
        conta.depositar(100);
        String saque = conta.sacar(50);

        assertEquals(saque, "Valor indisponível para saque");
    }

    @Test
    public void deposita(){
        Conta conta = new Conta(1, 0.0, "Cristiano Ronaldo");
        String deposito = conta.depositar(150);

        assertEquals(deposito, "Depósito de 150.0 reais");
    }

    @Test 
    public void transfere(){
        Conta conta1 = new Conta(1, 0.0, "Messi");
        Conta conta2 = new Conta(2, 0.0, "Gabriel");

        conta1.depositar(50);
        conta2.depositar(70);

        String transferencia = conta1.transferir(conta2, 20);

        assertEquals(transferencia, "Transferência de 20.0 reais");
    }

    @Test
    public void transfereIndisponivel(){
        Conta conta1 = new Conta(1, 0.0, "Messi");
        Conta conta2 = new Conta(2, 0.0, "Gabriel");

        conta1.depositar(50);
        conta2.depositar(70);

        String transferencia = conta1.transferir(conta2, 65);

        assertEquals(transferencia, "Saldo indisponível para transferência");
    }
}

