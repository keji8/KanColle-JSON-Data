package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *	远征必要条件
 */
@Entity
@Table(name="kancolle_expedition_requirements")
public class ExpeditionRequirements implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号，和游戏里的编号是一致的
	 */
	@Id
	private int id;
	
	
	/**
	 * 最低数量
	 */
	@Column(name="minimum_num")
	private Integer minimumNum;
	
	/**
	 * 旗舰最低等级
	 */
	@Column(name="flagship_min_level")
	private Integer flagShipMinLevel;
	
	/**
	 * 合计最低等级
	 */
	@Column(name="fleet_min_level")
	private Integer fleetMinLevel;
	
	
	/**
	 * 旗舰舰种，和ShipType实体是对应的
	 */
	@Column(name="flagship_type_id")
	private Integer flagshipTypeID;
	
	/**
	 * 所需舰船1
	 * 因为有可能有多种舰船都符合要求，这里存的不是一个ID，
	 * 而是一个字符串。
	 * 有多种舰船都复合要求的情况下，多个ID以逗号分隔
	 */
	@Column(name="ship_type1")
	private String shipType1;
	
	@Column(name="ship_type2")
	private String shipType2;
	
	@Column(name="ship_type3")
	private String shipType3;
	
	@Column(name="ship_type4")
	private String shipType4;
	
	@Column(name="ship_type5")
	private String shipType5;
	
	@Column(name="ship_type6")
	private String shipType6;
	
	/**
	 * 其他确保远征成功的必要条件
	 */
	@Column(name="other_requirements")
	private String otherRequirements;
	
	/**
	 * 备注
	 */
	@Column(length=255)
	private String memo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getMinimumNum() {
		return minimumNum;
	}

	public void setMinimumNum(Integer minimumNum) {
		this.minimumNum = minimumNum;
	}

	public Integer getFlagShipMinLevel() {
		return flagShipMinLevel;
	}

	public void setFlagShipMinLevel(Integer flagShipMinLevel) {
		this.flagShipMinLevel = flagShipMinLevel;
	}

	public Integer getFleetMinLevel() {
		return fleetMinLevel;
	}

	public void setFleetMinLevel(Integer fleetMinLevel) {
		this.fleetMinLevel = fleetMinLevel;
	}

	public Integer getFlagshipTypeID() {
		return flagshipTypeID;
	}

	public void setFlagshipTypeID(Integer flagshipTypeID) {
		this.flagshipTypeID = flagshipTypeID;
	}

	public String getShipType1() {
		return shipType1;
	}

	public void setShipType1(String shipType1) {
		this.shipType1 = shipType1;
	}

	public String getShipType2() {
		return shipType2;
	}

	public void setShipType2(String shipType2) {
		this.shipType2 = shipType2;
	}

	public String getShipType3() {
		return shipType3;
	}

	public void setShipType3(String shipType3) {
		this.shipType3 = shipType3;
	}

	public String getShipType4() {
		return shipType4;
	}

	public void setShipType4(String shipType4) {
		this.shipType4 = shipType4;
	}

	public String getShipType5() {
		return shipType5;
	}

	public void setShipType5(String shipType5) {
		this.shipType5 = shipType5;
	}

	public String getShipType6() {
		return shipType6;
	}

	public void setShipType6(String shipType6) {
		this.shipType6 = shipType6;
	}

	public String getOtherRequirements() {
		return otherRequirements;
	}

	public void setOtherRequirements(String otherRequirements) {
		this.otherRequirements = otherRequirements;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
