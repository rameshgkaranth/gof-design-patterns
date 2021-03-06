/**
 * 
 */
package creational.factorymethod;

/**
 * @author rkaranth
 *
 */
public class XMLLoggerFactory extends LoggerCreator {

	/* (non-Javadoc)
	 * @see creational.factorymethod.LoggerFactory#createLogger()
	 */
	@Override
	public Logger createLogger() {
		return new XMLLogger();
	}

}
