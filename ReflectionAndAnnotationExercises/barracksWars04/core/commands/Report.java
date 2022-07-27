package barracksWars04.core.commands;

import barracksWars04.interfaces.Repository;
import barracksWars04.interfaces.UnitFactory;

public class Report extends Command{
    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String output = super.getRepository().getStatistics();
        return output;
    }
}
