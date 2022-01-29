/*
SistemaBanco: um Sitema de Bancos usando conceitos de Orientação a Objetos.
Copyright (C) 2022  Shobon03

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
*/

package pkt_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Shobon03");
		
		Conta contaCorrente1 = new ContaCorrente(c1);
		Conta contaPoupanca1 = new ContaPoupanca(c1);
		
		contaCorrente1.depositar(1000);
		contaCorrente1.transferir(450, contaPoupanca1);
		
		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();
		
		Banco banco1 = new Banco("Brás");
		banco1.adicionarCliente(c1);
		banco1.adicionarConta(contaCorrente1);
		banco1.adicionarConta(contaPoupanca1);	
		
	}
	
}
