package barracksWars04.core.commands;

import barracksWars04.interfaces.Repository;
import barracksWars04.interfaces.Unit;
import barracksWars04.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Add extends Command{
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = super.getData()[1];
        Unit unitToAdd = super.getUnitFactory().createUnit(unitType);
        super.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
