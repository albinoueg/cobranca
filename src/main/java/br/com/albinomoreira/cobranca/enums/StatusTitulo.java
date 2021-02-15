package br.com.albinomoreira.cobranca.enums;

public enum StatusTitulo {

	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private String descricao;
	
	StatusTitulo(String descicao) {
		this.descricao = descicao;
	}
	
	public String getDescicao() {
		return descricao;
	}
}
