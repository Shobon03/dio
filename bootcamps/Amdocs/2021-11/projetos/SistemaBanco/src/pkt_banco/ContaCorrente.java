/*
Essa classe faz parte do SistemaBanco.
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

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println("\n===== EXTRATO CONTA CORRENTE =====");
		super.imprimirInfos();
		
	}
	
}
