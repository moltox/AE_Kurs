package dbaccess;

import javax.script.*;

public class Engine {
	public static void main(String args[]) {
		final ScriptEngineManager manager = new ScriptEngineManager();

		for (final ScriptEngineFactory factory : manager.getEngineFactories())
		{
			System.out.println(factory.getEngineName());
			System.out.println(factory.getEngineVersion());
			System.out.println(factory.getLanguageName());
			System.out.println(factory.getLanguageVersion());
			System.out.println(factory.getExtensions());
		}
	}
}
