package POO.Encapsulamento;

public class Saldo {

    private double saldo; // inicia em 0

    public Saldo() {
        this.saldo = 0.00;
        mostrarMensagem();
    }

    public Saldo(double saldoInicial) {
        this.saldo = saldoInicial;
        mostrarMensagem();
    }

    private void mostrarMensagem() {
        if (saldo < 0) {
            System.out.println("Você está com saldo negativo. Saldo atual: " + saldo);
        } else {
            System.out.println("Você está com saldo positivo. Saldo atual: " + saldo);
        }
    }

    public double consultaSaldo() {
        return saldo;
    }

    public void depositarSaldo(double valor) {
        saldo += valor;
        mostrarMensagem();
    }

    public void sacarSaldo(double valor) {
        saldo -= valor;
        mostrarMensagem();
    }

    public double pagarBoleto(double precoBoleto) {
        saldo -= precoBoleto;
        mostrarMensagem();
        return precoBoleto;
    }
}
