package barracksWars04.core.factories;

import barracksWars04.interfaces.Unit;
import barracksWars04.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// TODO: implement for problem 3

		Class<?> reflection = Class.forName(UNITS_PACKAGE_NAME + unitType);

//		throw new ExecutionControl.NotImplementedException("message");

		return (Unit) reflection.getDeclaredConstructor().newInstance();
	}
}
