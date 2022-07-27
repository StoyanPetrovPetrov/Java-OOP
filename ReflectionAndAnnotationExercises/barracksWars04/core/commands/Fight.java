package barracksWars04.core.commands;

import barracksWars04.interfaces.Repository;
import barracksWars04.interfaces.UnitFactory;

public class Fight extends Command{
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
