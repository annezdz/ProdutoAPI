package com.produto.ProdutoApi.entities;

import javax.persistence.*;

@Entity
@Table(name = "massas")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMASSAS")
	private int idMassas;

	@Column(name = "NAME_PRODUCT")
	private String nameProduct;

	@Column(name = "CUSTOMIZATION")
	private String customization;

	@Column(name = "DISPLAY")
	private String display;

	@Column(name = "DISPLAY_RESOLUTION")
	private String displayResolution;

	@Column(name = "DISPLAY_SIZE")
	private String displaySize;

	@Column(name = "MEMORY")
	private String memory;

	@Column(name = "OPERATING_SYSTEM")
	private String operatingSystem;

	@Column(name = "PROCESSOR")
	private String processor;

	@Column(name = "TOUCHSCREEN")
	private String touchscreen;

	@Column(name = "WEIGHT")
	private String weight;

	@Column(name = "COLOR")
	private String color;

	public Produto() {
	}

	public Produto(int idMassas,
				   String nameProduct,
				   String customization,
				   String display,
				   String displayResolution,
				   String displaySize,
				   String memory,
				   String operatingSystem,
				   String processor,
				   String touchscreen,
				   String weight,
				   String color) {
		this.idMassas = idMassas;
		this.nameProduct = nameProduct;
		this.customization = customization;
		this.display = display;
		this.displayResolution = displayResolution;
		this.displaySize = displaySize;
		this.memory = memory;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.touchscreen = touchscreen;
		this.weight = weight;
		this.color = color;
	}

	public int getIdMassas() {
		return idMassas;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public String getCustomization() {
		return customization;
	}

	public String getDisplay() {
		return display;
	}

	public String getDisplayResolution() {
		return displayResolution;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public String getMemory() {
		return memory;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public String getTouchscreen() {
		return touchscreen;
	}

	public String getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
