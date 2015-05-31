package jpaentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 船的实体类
 */
@Entity
@Table(name="kancolle_ship")
@IdClass(ShipPK.class)
public class Ship implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键一，没有实际意义的编号。
	 * 一艘船所有形态共用一个ship_no
	 */
	@Id
	@Column(name="ship_no")
	private int shipNo;
	
	/**
	 * 主键二，改装顺序
	 * 不改的船是0，改是1，改二是2，以此类推。
	 */
	@Id
	@Column(name="remodeling_stage")
	private int remodelingStage = 0;
	
	/**
	 * 游戏里的图鉴编号。
	 * 部分改过之后的船和没改的船共用一个图鉴编号。但是基本上改二之后都会有新的编号。
	 * 正因如此，这个编号不能拿来做主键
	 */
	@Column(name="illustration_no")
	private int illustrationNo;
	
	/**
	 * 改修等级，不用改的船是1，需要改修得来的船有对应的等级
	 */
	@Column(name="minimum_level")
	private int minimumLevel = 1;
	
	/**
	 * 是否需要设计图。
	 * 如果底层数据库支持布尔型数据，则不需要@Convert注解
	 */
	@Column(name="use_blueprint")
	@Convert(converter=BooleanConverter.class)
	private boolean useBlueprint;
	
	/**
	 * 日文汉字名称
	 */
	private String name;
	
	/**
	 * 日文平假名名称
	 */
	private String kana;
	
	/**
	 * 船型，例如陆奥是长门型战舰。
	 * 有的船没有船型
	 */
	@Column(name="ship_class")
	private String shipClass;
	
	/**
	 * 同型舰中的第几艘，例如陆奥是长门型的第二艘，这里就是2
	 */
	private int ordinal = 1;
	
	/**
	 * 舰种，即什么类型的船。关联ShipType类中的主键。
	 * 因为要和JSON数据的扁平化的格式保持一致，这里没有写成实体类关联的形式。
	 */
	@Column(name="type_id",nullable=false)
	private int typeID;
	
	/**
	 * 耐久（生命值）
	 */
	private Integer durability;
	
	/**
	 * 初始护甲
	 */
	@Column(name="armor_init")
	private Integer armorInit;
	
	/**
	 * 最大护甲
	 */
	@Column(name="armor_max")
	private Integer armorMax;
	
	/**
	 * 初始火力
	 */
	@Column(name="attack_init")
	private Integer attackInit;
	
	/**
	 * 最大火力
	 */
	@Column(name="attack_max")
	private Integer attackMax;
	
	/**
	 * 初始雷装
	 */
	@Column(name="torpedo_init")
	private Integer torpedoInit;
	
	/**
	 * 最大雷装
	 */
	@Column(name="torpedo_max")
	private Integer torpedoMax;
	
	/**
	 * 初始对空
	 */
	@Column(name="anti_air_init")
	private Integer antiAirInit;
	
	/**
	 * 最大对空
	 */
	@Column(name="anti_air_max")
	private Integer antiAirMax;
	
	/**
	 * 初始反潜
	 */
	@Column(name="anti_submarine_init")
	private Integer antiSubmarineInit;
	
	/**
	 * 最大反潜
	 */
	@Column(name="anti_submarine_max")
	private Integer antiSubmarineMax;
	
	/**
	 * 初始索敌
	 */
	@Column(name="scouting_init")
	private Integer scoutingInit;
	
	/**
	 * 最大索敌
	 */
	@Column(name="scouting_max")
	private Integer scoutingMax;
	
	/**
	 * 初始运
	 */
	@Column(name="luck_init")
	private Integer luckInit;
	
	/**
	 * 最大运
	 */
	@Column(name="luck_max")
	private Integer luckMax;
	
	/**
	 * 初始闪避
	 */
	@Column(name="evasion_init")
	private Integer evasionInit;
	
	/**
	 * 最大闪避
	 */
	@Column(name="evasion_max")
	private Integer evasionMax;
	
	/**
	 * 搭载量（总计）
	 */
	private Integer aircrafts;
	
	/**
	 * 速度
	 */
	private String speed;
	
	/**
	 * 射程
	 */
	private String range;
	
	/**
	 * 消耗燃油
	 */
	private Integer fuel;
	
	/**
	 * 消耗弹药
	 */
	private Integer ammo;
	
	/**
	 * 声优
	 */
	private String CV;
	
	/**
	 * 画师 
	 */
	private String illustrator;

	public int getShipNo() {
		return shipNo;
	}

	public void setShipNo(int shipNo) {
		this.shipNo = shipNo;
	}

	public int getRemodelingStage() {
		return remodelingStage;
	}

	public void setRemodelingStage(int remodelingStage) {
		this.remodelingStage = remodelingStage;
	}

	public int getMinimumLevel() {
		return minimumLevel;
	}

	public void setMinimumLevel(int minimumLevel) {
		this.minimumLevel = minimumLevel;
	}

	public boolean isUseBlueprint() {
		return useBlueprint;
	}

	public void setUseBlueprint(boolean useBlueprint) {
		this.useBlueprint = useBlueprint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getShipClass() {
		return shipClass;
	}

	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public Integer getDurability() {
		return durability;
	}

	public void setDurability(Integer durability) {
		this.durability = durability;
	}

	public Integer getAttackMax() {
		return attackMax;
	}

	public void setAttackMax(Integer attackMax) {
		this.attackMax = attackMax;
	}

	public Integer getAttackInit() {
		return attackInit;
	}

	public void setAttackInit(Integer attackInit) {
		this.attackInit = attackInit;
	}

	public Integer getTorpedoMax() {
		return torpedoMax;
	}

	public void setTorpedoMax(Integer torpedoMax) {
		this.torpedoMax = torpedoMax;
	}

	public Integer getTorpedoInit() {
		return torpedoInit;
	}

	public void setTorpedoInit(Integer torpedoInit) {
		this.torpedoInit = torpedoInit;
	}

	public Integer getAntiAirMax() {
		return antiAirMax;
	}

	public void setAntiAirMax(Integer antiAirMax) {
		this.antiAirMax = antiAirMax;
	}

	public Integer getAntiAirInit() {
		return antiAirInit;
	}

	public void setAntiAirInit(Integer antiAirInit) {
		this.antiAirInit = antiAirInit;
	}

	public Integer getAntiSubmarineMax() {
		return antiSubmarineMax;
	}

	public void setAntiSubmarineMax(Integer antiSubmarineMax) {
		this.antiSubmarineMax = antiSubmarineMax;
	}

	public Integer getAntiSubmarineInit() {
		return antiSubmarineInit;
	}

	public void setAntiSubmarineInit(Integer antiSubmarineInit) {
		this.antiSubmarineInit = antiSubmarineInit;
	}

	public Integer getScoutingMax() {
		return scoutingMax;
	}

	public void setScoutingMax(Integer scoutingMax) {
		this.scoutingMax = scoutingMax;
	}

	public Integer getScoutingInit() {
		return scoutingInit;
	}

	public void setScoutingInit(Integer scoutingInit) {
		this.scoutingInit = scoutingInit;
	}

	public Integer getLuckMax() {
		return luckMax;
	}

	public void setLuckMax(Integer luckMax) {
		this.luckMax = luckMax;
	}

	public Integer getLuckInit() {
		return luckInit;
	}

	public void setLuckInit(Integer luckInit) {
		this.luckInit = luckInit;
	}

	public Integer getEvasionMax() {
		return evasionMax;
	}

	public void setEvasionMax(Integer evasionMax) {
		this.evasionMax = evasionMax;
	}

	public Integer getEvasionInit() {
		return evasionInit;
	}

	public void setEvasionInit(Integer evasionInit) {
		this.evasionInit = evasionInit;
	}

	public Integer getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(Integer aircrafts) {
		this.aircrafts = aircrafts;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public Integer getFuel() {
		return fuel;
	}

	public void setFuel(Integer fuel) {
		this.fuel = fuel;
	}

	public Integer getAmmo() {
		return ammo;
	}

	public void setAmmo(Integer ammo) {
		this.ammo = ammo;
	}

	public String getCV() {
		return CV;
	}

	public void setCV(String cV) {
		CV = cV;
	}

	public String getIllustrator() {
		return illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}

	public int getIllustrationNo() {
		return illustrationNo;
	}

	public void setIllustrationNo(int illustrationNo) {
		this.illustrationNo = illustrationNo;
	}

	public Integer getArmorInit() {
		return armorInit;
	}

	public void setArmorInit(Integer armorInit) {
		this.armorInit = armorInit;
	}

	public Integer getArmorMax() {
		return armorMax;
	}

	public void setArmorMax(Integer armorMax) {
		this.armorMax = armorMax;
	}
}
