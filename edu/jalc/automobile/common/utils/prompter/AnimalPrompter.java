package edu.jalc.automobile.common.utils.prompter;
public class AnimalPrompter{

  public static void main(String[] args) throws Exception{
    TerminalPrompterBuilder tpb = TerminalPrompterBuilder.newBuilder();


      TerminalPrompter tp = tpb.addType("Animal")
      .addOption("dog")
      .addOption("cat")
      .sort()
      .build();


      tp.ask();

      switch(TerminalPrompterBuilder.newBuilder().addType("Parts")
        .addOption("Suspension")
        .build()
        .ask()){
          case 1: System.out.println("you picked 1");
        }

  }
}
