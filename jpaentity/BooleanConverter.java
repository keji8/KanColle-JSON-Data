package jpaentity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class BooleanConverter implements AttributeConverter<Boolean, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Boolean attribute) {
		return attribute ? 1 : 0;
	}

	@Override
	public Boolean convertToEntityAttribute(Integer dbData) {
		return dbData == 0 ? false : true;
	}

}
