package edu.jalc.automobile.common.utils.prompter;

<<<<<<< HEAD
import edu.jalc.automobile.onlinebuilder.components.Component;
import edu.jalc.automobile.parts.body.Paint;

=======
>>>>>>> 67b8e179a889eff51e6eaddb7d354599bd2c3ad4
import java.util.ArrayList;

public class TerminalPrompterBuilder implements TerminalPrompterBuilderInterface {

<<<<<<< HEAD
	private ArrayList<Object> components = new ArrayList<>();
=======
	private ArrayList<Object> options = new ArrayList<>();
>>>>>>> 67b8e179a889eff51e6eaddb7d354599bd2c3ad4
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
<<<<<<< HEAD
		this.components.add(object);
=======
		this.options.add(object);
>>>>>>> 67b8e179a889eff51e6eaddb7d354599bd2c3ad4
		return this;
	}

	@Override
	public TerminalPrompterBuilderInterface sort() {
		this.options.sort((a, b) -> a.toString().compareTo(b.toString()));
		return this;
	}

	@Override
	public TerminalPrompter build() throws Exception{

		if(this.type == null){
			throw new Exception("Type is null, cannot continue");
		}

		if(this.options.size() == 0){
			throw new Exception("You have added no components, cannot continue");
		}
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Your options for " + this.type + " are:\r\n");

		options.stream().forEach((component) ->
						stringBuilder.append(itemNumber++ + ". " + component + "\r\n"));

		stringBuilder.append("\r\n\r\nPlease answer 1 - " + (itemNumber - 1));

		return new TerminalPrompter(stringBuilder.toString(), this.options.size());
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Object> getOptions(){
		return (ArrayList) this.options.clone();
	}
}
