package barracksWars04;

import barracksWars04.interfaces.Repository;
import barracksWars04.interfaces.Runnable;
import barracksWars04.interfaces.UnitFactory;
import barracksWars04.core.Engine;
import barracksWars04.core.factories.UnitFactoryImpl;
import barracksWars04.data.UnitRepository;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
