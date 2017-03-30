package edu.jalc.automobile.common.utils.prompter;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.HorsePower;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.Torque;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.SuperchargedSportEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.TurbochargedSportEngine;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.induction.SuperchargedInduction;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;

public class TerminalPrompterBuilderTest {

	public static void main(String... args) throws Exception {

		//given
		SuperchargedSportEngine superchargedSportEngine = new SuperchargedSportEngine(
						new SportEngine(0,
										new HorsePower(0,0),
										new Torque(0, 0),
										8),
						new PerformanceExhaust(),
						new SuperchargedInduction());


		TurbochargedSportEngine turbochargedSportEngine = new TurbochargedSportEngine(
						new SportEngine(0,
										new HorsePower(0,0),
										new Torque(0,0),
										8
						),
						new PerformanceExhaust(),
						new TurbochargedInduction());

		TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();


		//when
		builder.addType("Engine");
		builder.addOption(turbochargedSportEngine);
		builder.addOption(superchargedSportEngine);
		builder.sort();
		TerminalPrompter prompter = builder.build();

		int result = prompter.ask();

		//expect
		assert(result == 1 || result == 2);

	}
}
