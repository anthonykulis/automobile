package edu.jalc.automobile.common.utils.prompter;

public interface TerminalPrompterBuilderInterface {

	public TerminalPrompterBuilderInterface addType(String type);
	public TerminalPrompterBuilderInterface addOption(Object object);
	public TerminalPrompterBuilderInterface sort();
	public TerminalPrompter build() throws Exception;
}
