package com.springboot.microservice.servicec_commons.model.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "PRODUCTNAME")
	private String productName;
	@Column(name = "CRATIONDATE")
	@Temporal(TemporalType.DATE)
	private Date crationDate;
	private BigDecimal price;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private Integer port;
}
