package jpaentity;

import java.io.Serializable;

/**
 * {@link Ship}类的主键类。
 * 为了使用@IdClass注解而设置的类，没有实际意义。
 */
public class ShipPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int shipNo;
	
	private int remodelingStage = 0;

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
}
