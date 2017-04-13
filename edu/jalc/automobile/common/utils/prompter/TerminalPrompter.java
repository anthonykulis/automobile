package edu.jalc.automobile.common.utils.prompter;

import java.util.Scanner;

public class TerminalPrompter implements Askable {

	private final String promptMessage;
	private final Scanner scanner = new Scanner(System.in);
	private final int numberOfOptions;

	TerminalPrompter(String promptMessage, int numberOfOptions){
		this.promptMessage = promptMessage;
		this.numberOfOptions = numberOfOptions;
	}

	public void tell(String message){
		System.out.println(message);
	}

	public int ask() {

		Integer result = 0;

		// try to ask, if not a int, ask again
		try{
			result = new Integer(this.ask(this.promptMessage));
		} catch (Exception e){
			return this.ask();
		}

		// got an int, if not legal value, ask again
		if(result < 1 || result > numberOfOptions) return this.ask();

		return result;
	}

	private String ask(String question){
		System.out.println(question);
		return scanner.nextLine();
	}

}

