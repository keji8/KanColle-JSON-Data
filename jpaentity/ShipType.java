package jpaentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 舰种实体类
 */
@Entity
@Table(name="kancolle_ship_type")
public class ShipType implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 舰种ID，没有实际意义的主键
	 */
	@Id
	@Column(name="type_id")
	private int typeID;

	/**
	 * 种类名，例如战舰，驱逐舰等
	 */
	@Column(name="type_name",nullable=false)
	private String typeName;

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "ShipType [typeID=" + typeID + ", typeName=" + typeName + "]";
	}
}
