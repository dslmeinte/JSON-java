package org.json;

/**
 * Common super type for {@link JSONArray} and {@link JSONObject},
 * primarily to make traversing up containment hierarchies possible.
 * 
 * @author Meinte Boersma
 */
abstract public class JSONType {

	private JSONType container = null;

	/**
	 * @return The container in the JSON containment tree or {@code null} if this is the root.
	 */
	public JSONType getContainer() {
		return container;
	}

	/**
	 * Sets the container of this JSON object.
	 * @param container - the container object, <em>which then assumes responsibility over the containment link</em>.
	 * @return This JSON object, for chaining.
	 */
	protected <T extends JSONType> T setContainer(T container) {
		this.container = container;
		return container;	// for chaining (with correct generic type)
	}

}
