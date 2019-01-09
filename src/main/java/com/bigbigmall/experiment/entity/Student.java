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
 * 學生
 *
 * @author Chiah
 */
@Entity
@Table(catalog = "\"postgres\"", schema = "\"public\"", name = "\"student\"")
@SuppressWarnings("PersistenceUnitPresent")
public class Student implements Serializable {

	private static final long serialVersionUID = -9058724753652876233L;

	@Basic(optional = false)
	@Column(nullable = false, name = "\"id\"")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	@Basic(optional = false)
	@Column(nullable = false, name = "\"name\"")
	@NotNull
	private String name;

	/**
	 * 預設建構子
	 */
	public Student() {
	}

	/**
	 * @param id 主鍵
	 */
	protected Student(Integer id) {
		this.id = id;
	}

	/**
	 * @param name 學生姓名
	 */
	public Student(String name) {
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
		if (!(object instanceof Student)) {
			return false;
		}
		Student other = (Student) object;
		return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "com.example.demo.entity.Student[ id=" + id + " ]";
	}

	/**
	 * @return 主鍵
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id 主鍵
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return 學生姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 學生姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
}
