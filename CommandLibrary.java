package Commands;

import java.util.Map;

public class CommandLibrary {

    //The commands are stored in a RegexTreeMap
    private static Map<String, Command> COMMAND_MAP = new RegexTreeMap<>();
    //The Command used if no matches could be found in the Library
    private final Command INVALID_COMMAND = new InvalidCommand();

    /**
     * Adds a Command to the {@link CommandLibrary} using the given #commandString as the identifier and the #command
     * as its designated value.
     *
     * @param commandString the String used as the regex identifier.
     * @param command the {@link Command} designated to the identifier.
     */
    public void addCommand(String commandString,Command command){
        COMMAND_MAP.put(commandString,command);
    }

    /**
     * Return the Command corresponding to the given String #command.
     *
     * If no {@link Command} was matched to the given key, null is returned.
     *
     * @param command the String used to search the {@link CommandLibrary} for the corresponding {@link Command}.
     * @return the corresponding {@link Command} if it exists, null otherwise.
     */
    public Command getCommand(String command){
        return COMMAND_MAP.get(command);
    }


    /**
     * Searches the {@link CommandLibrary} for the {@link Command} corresponding to the given String and
     * calls the {@link Command#execute(String)} function afterwords.
     *
     * If no {@link Command} could be found corresponding to the gievn String, the {@link InvalidCommand} class is used.
     *
     * @param command the String used to search the {@link CommandLibrary} for the corresponding {@link Command}.
     * @return The {@link ReturnPackage} given by {@link Command#execute(String)} function of the {@link Command}.
     */
    public ReturnPackage executeCommand(String command){
        if(COMMAND_MAP.containsKey(command)) {
            return getCommand(command).execute(command);
        } else {
            return INVALID_COMMAND.execute(command);
        }
    }


    private class InvalidCommand extends AbstractCommand {

        @Override
        public ReturnPackage execute(String command) {
            return new ReturnPackage("Command:"+command+" is not known or the format of the given " +
                    "parameters is not according to the documentation",true,false);

        }
    }


}
