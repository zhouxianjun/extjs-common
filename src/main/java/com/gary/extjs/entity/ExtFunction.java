package com.gary.extjs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.springframework.util.StringUtils;

import com.gary.util.ValidateUtils;

@Entity
public class ExtFunction {
	private String id;
	private String text;
	private boolean leaf;
	private boolean expanded = false;
	private boolean checked = false;
	private boolean local = false;
	private String cls = "folder";
	private List<ExtFunction> children = new ArrayList<ExtFunction>();
	private List<ExtModular> modulars = new ArrayList<ExtModular>();
	private Integer fid;
	private Boolean parent;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	
	@JsonManagedReference
	@ManyToMany
	public List<ExtFunction> getChildren() {
		return children;
	}
	public void setChildren(List<ExtFunction> children) {
		this.children = children;
	}
	
	@JsonBackReference
	@ManyToMany(mappedBy = "functions")
	public List<ExtModular> getModulars() {
		return modulars;
	}
	public void setModulars(List<ExtModular> modulars) {
		this.modulars = modulars;
	}
	
	public String getId() {
		if((id == null || "".equals(id) || children.size() > 0) && fid != null)
			id = String.valueOf(fid);
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	@GeneratedValue
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public boolean isLeaf() {
		leaf = parent == null ? getChildren().size() < 1 : !parent;
		leaf = StringUtils.isEmpty(id) ? false : leaf;
		if(!StringUtils.isEmpty(id) && ValidateUtils.zhengshuValidate(id)){
			leaf = Integer.parseInt(id) == fid ? false : leaf;
		}
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	
	@Transient
	public Boolean getParent() {
		return parent;
	}
	public void setParent(Boolean parent) {
		this.parent = parent;
	}
	
	@Transient
	public int[] getChildrenIds(){
		int[] fids = new int[children.size()];
		int j = 0;
		for (ExtFunction function : children) {
			fids[j] = function.getFid();
			j++;
		}
		return fids;
	}
	
	@Transient
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
}
