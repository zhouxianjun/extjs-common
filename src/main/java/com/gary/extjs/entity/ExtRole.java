package com.gary.extjs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
public class ExtRole implements Serializable {
	private static final long serialVersionUID = -2234827264698597642L;
	private Integer id;
	private List<ExtModular> modulars = new ArrayList<ExtModular>();
	private List<ExtFunction> functions = new ArrayList<ExtFunction>();
	private String name;
	private String descr = "";
	private boolean enable = true;
	
	public ExtRole(String name, String descr) {
		// TODO Auto-generated constructor stub
		this.descr = descr;
		this.name = name;
	}
	
	public ExtRole() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@JsonManagedReference
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "modular_id")
	public List<ExtModular> getModulars() {
		return modulars;
	}
	public void setModulars(List<ExtModular> modulars) {
		this.modulars = modulars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany
	public List<ExtFunction> getFunctions() {
		return functions;
	}
	public void setFunctions(List<ExtFunction> functions) {
		this.functions = functions;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
