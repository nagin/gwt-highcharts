package us.ascendtech.highcharts.client.chartoptions.series.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPointEvents;

@JsFunction
public interface AfterAnimate {
	void afterAnimate(SeriesPointEvents event);
}
