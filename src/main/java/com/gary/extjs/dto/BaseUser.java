package com.gary.extjs.dto;

import java.io.Serializable;

import javax.persistence.Transient;

public class BaseUser implements Serializable {
	private static final long serialVersionUID = 1L;
	@Transient
	private String _name;
	@Transient
	private String _icon;
	@Transient
	private String _nickName;
	@Transient
	private int _role;
	@Transient
	private boolean _sys;
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_icon() {
		return _icon;
	}
	public void set_icon(String _icon) {
		this._icon = _icon;
	}
	public String get_nickName() {
		return _nickName;
	}
	public void set_nickName(String _nickName) {
		this._nickName = _nickName;
	}
	public int get_role() {
		return _role;
	}
	public void set_role(int _role) {
		this._role = _role;
	}
	public boolean is_sys() {
		return _sys;
	}
	public void set_sys(boolean _sys) {
		this._sys = _sys;
	}
}
