import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoggerFactory{
	/**
	 * Determina si FileLoggin está activo
	 * @return true, cuando FileLoggin está activo, false en caso contrario
	 * @throws Exception
	 */
	public boolean isFileLogginEnabled() throws Exception {
		Properties p = new Properties();
		try {
			p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
			String fileLogginValue = p.getProperty("FileLogging");
			if (fileLogginValue.equalsIgnoreCase("ON") == true)
				return true;
			else
				return false;
		} catch (FileNotFoundException ex) {
			throw ex;
		} catch (IOException e) {
			throw e;
		}
	}

	/**
	 * Factory Method
	 * @return un objeto de la jerarquia Logger, incluyendo NullLogger
	 */
	public Logger getLogger() {
		Logger logger = null;
		try {
			if (isFileLogginEnabled()) {
				logger = new FileLogger();
			} else {
				logger = new ConsoleLogger();
			}
		} catch (Exception e) {
			logger = new NullLogger();
		}
		return logger;
	}
}
