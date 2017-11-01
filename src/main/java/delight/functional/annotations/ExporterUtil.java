package delight.functional.annotations;

import com.google.gwt.core.client.JavaScriptObject;

public class ExporterUtil {

	public native static JavaScriptObject wrap(Object o )/*-{ return o; }-*/;
	
	public static Object gwtInstance(Object o) {
		return o;
	}
}
