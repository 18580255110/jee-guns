package hh.jee.guns.lang.convert.impl;


import hh.jee.guns.lang.convert.AbstractConverter;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

/**
 * 
 * {@link Duration}对象转换器
 * 
 * @author Looly, huahua
 */
public class DurationConverter extends AbstractConverter<Duration> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Duration convertInternal(Object value) {
		if(value instanceof TemporalAmount){
			return Duration.from((TemporalAmount) value);
		} else if(value instanceof Long){
			return Duration.ofMillis((Long) value);
		} else {
			return Duration.parse(convertToStr(value));
		}
	}

}
