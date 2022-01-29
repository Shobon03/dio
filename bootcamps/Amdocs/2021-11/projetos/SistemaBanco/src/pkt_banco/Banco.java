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

import java.util.ArrayList;

public class Banco {
	
	private String nome;
	private ArrayList<Cliente> clientes;
	private ArrayList<Conta> contas;
	
	
	public Banco() {
		super();
	}
	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public ArrayList<Conta> getContas() {
		return contas;
	}
	
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
		
}
