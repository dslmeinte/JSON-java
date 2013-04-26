package org.json;

/**
 * Common super type for {@link JSONArray} and {@link JSONObject},
 * primarily to make traversing up containment hierarchies possible.
 * 
 * @author Meinte Boersma
 */
abstract class JSONType {

	protected JSONType parent = null;

	/**
	 * @return The parent in the JSON containment tree or {@code null} if this is the root.
	 */
	public JSONType getParent() {
		return parent;
	}

	/**
	 * Sets the parent of this JSON object.
	 * @param parent - the parent object, which assumes responsibility over the containment link.
	 * @return This JSON object, for chaining.
	 */
	public <T extends JSONType> T setParent(T parent) {
		this.parent = parent;
		return parent;	// for chaining (with correct generic type)
	}

}
