public class ExitCommand extends AbstractCommand{

    @Override
    public ReturnPackage execute(String command){
        return new ReturnPackage("",false,true);
    }
}
