package fr.istic;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class VideoGenValueConverter extends DefaultTerminalConverters {

	IValueConverter<Long> longValueConverter = new IValueConverter<Long>() {

		@Override
		public Long toValue(String string, INode node) throws ValueConverterException {
			// TODO make this more robust
			return Long.parseLong(string.substring(0, string.length() - 1));
		}

		@Override
		public String toString(Long value) throws ValueConverterException {
			// TODO make this more robust
			return Long.toString(value) + "L";
		}

	};
	
	IValueConverter<Double> doubleValueConverter = new IValueConverter<Double>() {

		@Override
		public Double toValue(String string, INode node) throws ValueConverterException {
			// TODO make this more robust
			return Double.parseDouble(string.substring(0, string.length() - 1));
		}

		@Override
		public String toString(Double value) throws ValueConverterException {
			// TODO make this more robust
			return Double.toString(value) + "d";
		}

	};

	@ValueConverter(rule = "LONG")
	public IValueConverter<Long> LONG() {
		return longValueConverter;
	}
	
	@ValueConverter(rule = "DOUBLE")
	public IValueConverter<Double> DOUBLE() {
		return doubleValueConverter;
	}

}
