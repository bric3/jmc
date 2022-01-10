package org.openjdk.jmc.common.test.unit;

import static org.junit.Assert.assertEquals;
import static org.openjdk.jmc.common.unit.UnitLookup.EPOCH_MS;
import static org.openjdk.jmc.common.unit.UnitLookup.EPOCH_NS;
import static org.openjdk.jmc.common.unit.UnitLookup.EPOCH_S;
import static org.openjdk.jmc.common.unit.UnitLookup.TIMESTAMP;

import org.junit.Test;
import org.openjdk.jmc.common.test.MCTestCase;
import org.openjdk.jmc.common.unit.IFormatter;
import org.openjdk.jmc.common.unit.IQuantity;
import org.openjdk.jmc.common.unit.IRange;
import org.openjdk.jmc.common.unit.UnitLookup;

@SuppressWarnings("nls")
public class TimestampKindTest extends MCTestCase {

	@Test
	public void test_something() {
		IFormatter<IRange<IQuantity>> rangeFormatter = UnitLookup.TIMESTAMP.getRangeFormatter(null);
	}

	@Test
	public void testTimestampKindDefaultFormatter() {
		String f_ns = TIMESTAMP.getDefaultFormatter().format(EPOCH_NS.quantity(750));
		String f_ms = TIMESTAMP.getDefaultFormatter().format(EPOCH_MS.quantity(750));
		String f_s = TIMESTAMP.getDefaultFormatter().format(EPOCH_S.quantity(750));

//		assertEquals("1/1/70, 1:00:00.750 AM", f_ms);
//		assertEquals("1/1/70, 1:12:30.000 AM", f_s);
		assertEquals("1970-01-01T00:00:00.000Z", f_ns);
		assertEquals("1970-01-01T00:00:00.750Z", f_ms);
		assertEquals("1970-01-01T00:12:30.000Z", f_s);
	}
}
