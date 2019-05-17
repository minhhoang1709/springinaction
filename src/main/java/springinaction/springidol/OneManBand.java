package springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}
