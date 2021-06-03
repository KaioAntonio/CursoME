package org.digitalse.Curso.dto;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.digitalse.Curso.entity.Curso;
import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CursoDto {
	private String nome;
	private String descricao;
	private String emanta;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	private float valor;
	
	public CursoDto(Curso produto) {
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.emanta = produto.getEmanta();
		this.dataCadastro = produto.getDataCadastro();
		this.dataInicio = produto.getDataInicio();
		this.valor = produto.getValor();
		
	}
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getEmanta() {
		return emanta;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public float getValor() {
		return valor;
	}
	
	
	public static List<CursoDto> converter(List<Curso> produtos){
		return produtos.stream().map(CursoDto::new).collect(Collectors.toList());
		//return produtos.map(ProdutoDto::new);
	}


}
