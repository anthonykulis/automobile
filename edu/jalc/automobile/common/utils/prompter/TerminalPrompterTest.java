package edu.jalc.automobile.common.utils.prompter;

public class TerminalPrompterTest {

	public static void main(String... args){


		// given
		String question = "1. Test question\r\n";
		TerminalPrompter prompter = new TerminalPrompter(question, 1);

		// when
		int result = prompter.ask();

		// expect
		assert(result == 1);
	}
}
