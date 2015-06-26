package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 远征数据实体类
 */
@Entity
@Table(name="kancolle_expedition")
public class Expedition implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号，和游戏里的编号是一致的
	 */
	@Id
	private int id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 耗时（分钟）
	 */
	private Integer duration;
	
	/**
	 * 消耗燃油百分比
	 */
	@Column(name="fuel_consumption")
	private Double fuelConsumption;
	
	/**
	 * 消耗弹药百分比
	 */
	@Column(name="ammo_consumption")
	private Double ammoConsumption;
	
	/**
	 * 提督经验值
	 */
	@Column(name="admiral_exp")
	private Integer admiralExp;
	
	/**
	 * 舰娘经验值
	 */
	@Column(name="ship_exp")
	private Integer shipExp;
	
	/**
	 * 获得弹药
	 */
	private Integer ammo;
	
	/**
	 * 获得燃油
	 */
	private Integer fuel;
	
	/**
	 * 获得钢材
	 */
	private Integer steel;
	
	/**
	 * 获得铝
	 */
	private Integer bauxite;
	
	/**
	 * 获得家具箱小
	 */
	private Integer chestSm;
	
	/**
	 * 获得家具箱中
	 */
	private Integer chestMed;
	
	/**
	 * 获得家具箱大
	 */
	private Integer chestLg;
	/**
	 * 获得桶
	 */
	private Integer bucket;
	
	/**
	 * 高速建造材
	 */
	private Integer flamer;
	
	/**
	 * 获得开发资财
	 */
	private Integer dev;
	
	
	public Integer getFlamer() {
		return flamer;
	}

	public void setFlamer(Integer flamer) {
		this.flamer = flamer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public Double getAmmoConsumption() {
		return ammoConsumption;
	}

	public void setAmmoConsumption(Double ammoConsumption) {
		this.ammoConsumption = ammoConsumption;
	}

	public Integer getAdmiralExp() {
		return admiralExp;
	}

	public void setAdmiralExp(Integer admiralExp) {
		this.admiralExp = admiralExp;
	}

	public Integer getShipExp() {
		return shipExp;
	}

	public void setShipExp(Integer shipExp) {
		this.shipExp = shipExp;
	}

	public Integer getAmmo() {
		return ammo;
	}

	public void setAmmo(Integer ammo) {
		this.ammo = ammo;
	}

	public Integer getFuel() {
		return fuel;
	}

	public void setFuel(Integer fuel) {
		this.fuel = fuel;
	}

	public Integer getSteel() {
		return steel;
	}

	public void setSteel(Integer steel) {
		this.steel = steel;
	}

	public Integer getBauxite() {
		return bauxite;
	}

	public void setBauxite(Integer bauxite) {
		this.bauxite = bauxite;
	}

	public Integer getBucket() {
		return bucket;
	}

	public void setBucket(Integer bucket) {
		this.bucket = bucket;
	}

	public Integer getChestSm() {
		return chestSm;
	}

	public void setChestSm(Integer chestSm) {
		this.chestSm = chestSm;
	}

	public Integer getChestMed() {
		return chestMed;
	}

	public void setChestMed(Integer chestMed) {
		this.chestMed = chestMed;
	}

	public Integer getChestLg() {
		return chestLg;
	}

	public void setChestLg(Integer chestLg) {
		this.chestLg = chestLg;
	}

	public Integer getDev() {
		return dev;
	}

	public void setDev(Integer dev) {
		this.dev = dev;
	}
}
