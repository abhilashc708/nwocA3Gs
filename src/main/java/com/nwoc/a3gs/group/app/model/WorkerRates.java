package com.nwoc.a3gs.group.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "workers_service_rates")
@EntityListeners(AuditingEntityListener.class)
public class WorkerRates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
	
	@OneToOne
	@JoinColumn(name="id")
	 private  List<Services> services;
	@OneToOne
	@JoinColumn(name="worker_id")
	 private List<Workers> workers;
    private  String description;
    private Double rate;
    private String unit;
    @JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updateddAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

	public List<Workers> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Workers> workers) {
		this.workers = workers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateddAt() {
		return updateddAt;
	}

	public void setUpdateddAt(Date updateddAt) {
		this.updateddAt = updateddAt;
	}

	
	

}
