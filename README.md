# CommandParser

This is a general purpose Structure to process user input commands.
This structure is aimed at the final programing task for the programing 1 lecture at the KIT.
Usualy both task need a command parser, this is a structure that can be used independent from the explicit task to easily recognize if a command exists and the given parameters are correct.

Commands consist of the prefix eg. add
A space 
And a suffix containing the parameters "sample.txt"

## Usage
##### Implement new Commands

##### Init a new CommandLibrary
```Java
CommandLibrary commandLibrary = new CommandLibrary();
```
##### Add Commands
```Java
Commands can be added using
CommandLibrary.addCommand(Command);
```

To escape a long list of addCommands() in the setup of the CommandLibrary Commands should be added to the CommandsEnum. 
This way the setup can be executed via:
```Java
for(CommandsEnum commandEnumCommand: CommandsEnum.values()){
    commandLibrary.addCommand(commandEnumCommand.getCommandRegex(),commandEnumCommand.getCommand());
}
```
as seen in CommandsExample.
This way all Commands disregarding their amount. In addition all Commands have their own place for easy editing.

Commands added to the CommandsEnum using the pattern:
```Java
NEW_COMMAND("<command prefix>","<command suffix>",new NewCommand());
```
<command prefix> should be replaced by the command prefix eg. "quit", "add", "exit" etc.
<command suffix> should be replaced by the regular Expresion for parameters that should be expected for the command. 
newCommand() ist the corressponding Class for the command

##### Parse user input / execute Commands



## How it works

## DISCLAIMER
This code can be used as inperation but I do not recommend to clone for your own final task as chances are sombody else will do so alswel which will result in getting a plagiarism accusation.
 
