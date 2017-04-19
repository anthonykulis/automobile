package edu.jalc.automobile.common.utils.prompter;

import edu.jalc.automobile.onlinebuilder.components.Component;

import java.util.ArrayList;

public class TerminalPrompterBuilder implements TerminalPrompterBuilderInterface {

	private ArrayList<Object> components = new ArrayList<>();
	private int itemNumber = 1;
	private String type;

	public static TerminalPrompterBuilder newBuilder(){
		return new TerminalPrompterBuilder();
	}

	@Override
	public TerminalPrompterBuilderInterface addType(String type) {
		this.type = type;
		return this;
	}

	@Override
	public TerminalPrompterBuilderInterface addOption(Object object) {
		this.components.add(object);
		return this;
	}

	@Override
	public TerminalPrompterBuilderInterface sort() {
		this.components.sort((a, b) -> a.toString().compareTo(b.toString()));
		return this;
	}

	@Override
	public TerminalPrompter build() throws Exception{

		if(this.type == null){
			throw new Exception("Type is null, cannot continue");
		}

		if(this.components.size() == 0){
			throw new Exception("You have added no components, cannot continue");
		}
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Your options for " + this.type + " are:\r\n");

		components.stream().forEach((component) ->
						stringBuilder.append(itemNumber++ + ". " + component + "\r\n"));

		stringBuilder.append("\r\n\r\nPlease answer 1 - " + (itemNumber - 1));

		return new TerminalPrompter(stringBuilder.toString(), this.components.size());
	}
}
