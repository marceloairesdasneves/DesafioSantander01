package contabancaria;

// @author Marcelo Neves

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class OperacaoBancaria {
    private String nome;
    private double saldoAtualSemLimiteEspecial; //saldo da conta - os valores
    private double valorSaldoEspecial; // valor do saldo do especial
    private double valorLimiteChequeEspecial = 5000; //limite fixo do especial do cliente 5000
    private double valorSaqueEspecial;
    private double valorSaque;
    private double valorDeposito;
    private double valorDoBoleto;
    private String isUsandoChequeEspecial = "S".toUpperCase();


    public double consultarSaldo() {
        if(isUsandoChequeEspecial.equalsIgnoreCase("S")) {
             valorSaldoEspecial = (valorLimiteChequeEspecial + ((valorDeposito) - (valorSaque) - (valorDoBoleto)));
            System.out.println("Saldo atual + limite especial: R$ " + valorSaldoEspecial);
            System.out.println("\tValor do limite do cheque especial: R$ " + ((valorSaldoEspecial) - valorDoBoleto));
            return valorSaldoEspecial;

        }
        else   {
            saldoAtualSemLimiteEspecial = valorDeposito - (valorSaque + valorDoBoleto);
            System.out.println("Saldo atual: R$ " + saldoAtualSemLimiteEspecial);
            return saldoAtualSemLimiteEspecial;
        }
    }

    public double consultarChequeEspecial() {
        double valorSaldoEspecial = (valorLimiteChequeEspecial + valorDeposito) - (valorSaque - valorDoBoleto);
        System.out.println("Limite do cheque especial: R$ " + valorSaldoEspecial);
        return valorSaldoEspecial;
    }
    public double depositarDinheiro(Scanner input){
        System.out.print("Digite o valor do deposito: ");
        setValorDeposito(input.nextDouble());
        System.out.println("Valor do deposito: R$ " + valorDeposito);
        return valorDeposito;
    }
    public double sacarDinheiro(Scanner input){
        System.out.print("Digite o valor do saque: ");
        setValorSaque(input.nextDouble());
        System.out.println("Valor do saque: R$ " + valorSaque);
        return valorSaque;
    }
    public double pagarBoleto(Scanner  input){
        System.out.print("Digite o valor do boleto do cliente: ");
        setValorDoBoleto(input.nextDouble());
        System.out.println("Valor do boleto: R$ " + valorDoBoleto);
        return valorDoBoleto;
    }

}
