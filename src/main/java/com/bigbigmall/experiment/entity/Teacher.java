package com.bigbigmall.experiment.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 老師
 *
 * @author Chiah
 */
@Entity
@Table(catalog = "\"postgres\"", schema = "\"public\"", name = "\"teacher\"")
@SuppressWarnings("PersistenceUnitPresent")
public class Teacher implements Serializable {

	private static final long serialVersionUID = 4574079041650839039L;

	@Basic(optional = false)
	@Column(name = "\"id\"")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Short id;

	@Basic(optional = false)
	@Column(nullable = false, name = "\"name\"")
	@NotNull
	private String name;

	/**
	 * 預設建構子
	 */
	public Teacher() {
	}

	/**
	 * @param id 主鍵
	 */
	protected Teacher(Short id) {
		this.id = id;
	}

	/**
	 * @param name 老師姓名
	 */
	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Teacher)) {
			return false;
		}
		Teacher other = (Teacher) object;
		return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "com.example.demo.entity.Teacher[ id=" + id + " ]";
	}

	/**
	 * @return 主鍵
	 */
	public Short getId() {
		return id;
	}

	/**
	 * @param id 主鍵
	 */
	public void setId(Short id) {
		this.id = id;
	}

	/**
	 * @return 老師姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 老師姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
}
