public class ClienteMain{

	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger();
		logger.log("Un mensaje a registrar");
	}
}
