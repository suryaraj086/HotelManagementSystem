package hms;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class HotelManagement {

	TempStore tempStore = new TempStore();

	public String sortByLocation(String location) {
		Map<String, List<Hotel>> map = tempStore.locationMap;
		String out = "";
		out += map.get(location);
		return out;
	}

	public String sortHotelName() {
		List<Hotel> hotel = tempStore.hotelList;
		Collections.sort(hotel, new Compare("name"));
		String out = "";
		for (int i = hotel.size() - 1; i >= 0; i--) {
			out += hotel.get(i);
			out += "\n";
		}
		return out;
	}

	public String sortRating() {
		List<Hotel> hotel = tempStore.hotelList;
		Collections.sort(hotel, new Compare("rating"));
		String out = "";
		for (int i = hotel.size() - 1; i >= 0; i--) {
			out += hotel.get(i);
			out += "\n";
		}
		return out;
	}

	public String sortRooms() {
		List<Hotel> hotel = tempStore.hotelList;
		Collections.sort(hotel, new Compare("rooms"));
		String out = "";
		for (int i = hotel.size() - 1; i >= 0; i--) {
			out += hotel.get(i);
			out += "\n";
		}
		return out;
	}

}
