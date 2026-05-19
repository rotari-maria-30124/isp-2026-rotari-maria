package Exrcise1;

public class TakeOffCommand extends AtcCommand{
    private int altitude;

    public TakeOffCommand(Command command, int altitude){
        super(command);
        this.altitude=altitude;
    }

}
