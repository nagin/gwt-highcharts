package us.ascendtech.highcharts.client.chartoptions.series.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPointEvents;

@JsFunction
public interface CheckboxClick {
	void checkboxClick(SeriesPointEvents event);
}
