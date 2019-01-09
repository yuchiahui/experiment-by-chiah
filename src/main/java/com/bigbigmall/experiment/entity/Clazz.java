package com.bigbigmall.experiment.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 班級
 *
 * @author Chiah
 */
@Entity
@Table(catalog = "\"postgres\"", schema = "\"public\"", name = "\"clazz\"")
@SuppressWarnings("PersistenceUnitPresent")
public class Clazz implements Serializable {

	private static final long serialVersionUID = -6141899859759797703L;

	@Basic(optional = false)
	@Column(nullable = false, name = "\"id\"")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@JoinColumn(name = "\"teacher\"", referencedColumnName = "\"id\"", nullable = false)
	@ManyToOne
	private Teacher teacher;

	@JoinColumn(name = "\"student\"", referencedColumnName = "\"id\"", nullable = false)
	@ManyToOne
	private Student student;

	/**
	 * 預設建構子
	 */
	public Clazz() {
	}

	/**
	 * @param id 主鍵
	 */
	protected Clazz(Long id) {
		this.id = id;
	}

	/**
	 * @param teacher 老師
	 * @param student 學生
	 */
	public Clazz(Teacher teacher, Student student) {
		this.teacher = teacher;
		this.student = student;
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
		if (!(object instanceof Clazz)) {
			return false;
		}
		Clazz other = (Clazz) object;
		return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "com.example.demo.entity.Clazz[ id=" + id + " ]";
	}

	/**
	 * @return 主鍵
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id 主鍵
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return 老師
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher 老師
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return 學生
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student 學生
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
}
