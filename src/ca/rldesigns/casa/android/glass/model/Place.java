package ca.rldesigns.casa.android.glass.model;

/**
 * This class represents a point of interest that has geographical coordinates (latitude and longitude) and a name that is displayed to the user.
 */
public class Place {

	private final int mIcon;
	private final double mLatitude;
	private final double mLongitude;
	private final String mName;
	private final String mPrice;

	/**
	 * Initialises a new place with the specified coordinates and name.
	 * 
	 * @param icon
	 *            the icon of the place
	 * @param latitude
	 *            the latitude of the place
	 * @param longitude
	 *            the longitude of the place
	 * @param name
	 *            the name of the place
	 */
	public Place(int icon, double latitude, double longitude, String name, String price) {
		mIcon = icon;
		mLatitude = latitude;
		mLongitude = longitude;
		mName = name;
		mPrice = price;
	}

	/**
	 * Gets the icon of the place.
	 * 
	 * @return the icon of the place
	 */
	public int getIcon() {
		return mIcon;
	}

	/**
	 * Gets the latitude of the place.
	 * 
	 * @return the latitude of the place
	 */
	public double getLatitude() {
		return mLatitude;
	}

	/**
	 * Gets the longitude of the place.
	 * 
	 * @return the longitude of the place
	 */
	public double getLongitude() {
		return mLongitude;
	}

	/**
	 * Gets the name of the place.
	 * 
	 * @return the name of the place
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Gets the price of the place.
	 * 
	 * @return the price of the place
	 */
	public String getPrice() {
		return mPrice;
	}
}
