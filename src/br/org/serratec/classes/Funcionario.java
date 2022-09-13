package br.org.serratec.classes;

import java.util.Set;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.exception.UniqueCPFException;
import br.org.serratec.interfaces.IFuncionario;

public class Funcionario extends Pessoa implements IFuncionario{
	protected Double salarioBruto;
	protected Double descontoINSS;
	protected Double descontoIR;
	public Set<Dependente> dependentes;

	public Funcionario(String nome, String cpf, String dataNascimento, String salarioBruto,
			Set<Dependente> dependentes) throws UniqueCPFException {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = Double.parseDouble(salarioBruto);
		this.dependentes = dependentes;
	}	

	public Double getDescontoINSS() {
		return descontoINSS;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	@Override
	public Double calculoINSS() {
		/*if (salarioBruto <= 1212.00) {
            return descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return descontoINSS = salarioBruto * 0.09 - 18.18;
        } else if (salarioBruto <= 3641.03) {
        	return descontoINSS = salarioBruto * 0.12 - 91;
        } else if (salarioBruto <= 7087.22) {
        	return descontoINSS = salarioBruto * 0.14 - 163.82;
        } else if (salarioBruto > 7087.22) {
            return descontoINSS = salarioBruto * 0.14 - 163.82;
        }*/
		return descontoINSS;
	}

	@Override
	public Double calculoIR() {//Possível Cálculo
		/*double baseCalculo = (salarioBruto - descontoINSS - "Valor Dependentes desconto");
		if (baseCalculo <= 1903.98) {
			descontoIR = 0.0;
		} else if (baseCalculo  <= 2826.65) {
			descontoIR = (baseCalculo * 0.075) - 142.8;
		} else if (baseCalculo  <= 3751.05) {
			descontoIR = (baseCalculo * 0.15) - 354.8;
		} else if (baseCalculo  <= 4664.68) {
			descontoIR = (baseCalculo * 0.225) - 636.13;
		} else if (baseCalculo > 4664.68) {
			descontoIR = (baseCalculo * 0.275) - 869.36;
		} */
		return descontoIR;
	}
}
