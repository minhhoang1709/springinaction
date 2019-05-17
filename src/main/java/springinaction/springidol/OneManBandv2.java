package springinaction.springidol;

import java.util.Map;
import springinaction.springidol.Instrument;
import springinaction.springidol.PerformanceException;
import springinaction.springidol.Performer;

public class OneManBandv2 implements Performer {

	public OneManBandv2() {
	}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	private Map<String, Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}
