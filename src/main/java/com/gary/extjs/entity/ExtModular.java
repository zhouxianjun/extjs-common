package com.gary.extjs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
public class ExtModular {
	private String modularIdentifer;
	private String icon;
	private Integer id;
	private String name;
	private boolean local;
	private boolean iconLocal;
	private List<ExtRole> roles = new ArrayList<ExtRole>();
	private List<ExtFunction> functions = new ArrayList<ExtFunction>();
	public String getModularIdentifer() {
		return modularIdentifer;
	}
	public void setModularIdentifer(String modularIdentifer) {
		this.modularIdentifer = modularIdentifer;
	}
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@JsonBackReference
	@ManyToMany(mappedBy = "modulars")
	public List<ExtRole> getRoles() {
		return roles;
	}
	public void setRoles(List<ExtRole> roles) {
		this.roles = roles;
	}
	
	@JsonManagedReference
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "function_id")
	public List<ExtFunction> getFunctions() {
		return functions;
	}
	public void setFunctions(List<ExtFunction> functions) {
		this.functions = functions;
	}
	
	@Transient
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@Transient
	public boolean isIconLocal() {
		return iconLocal;
	}
	public void setIconLocal(boolean iconLocal) {
		this.iconLocal = iconLocal;
	}
}
