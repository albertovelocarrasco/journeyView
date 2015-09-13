package alberto.example.com.tableview;

import java.util.List;

/**
 * Created by Alberto Velo Carrasco on 12/09/15.
 */
public class Data {
    String departureTime;
    String departureStatus;
    String arrivalTime;
    String originStationName;
    String destinationStationName;
    String company;
    String buttonLabel;
    List<String> seatRervation;

    public Data(
            String departureTime, String departureStatus, String arrivalTime,
            String originStationName, String destinationStationName, String company,
            String buttonLabel, List<String> seatRervation) {
        this.departureTime = departureTime;
        this.departureStatus = departureStatus;
        this.arrivalTime = arrivalTime;
        this.originStationName = originStationName;
        this.destinationStationName = destinationStationName;
        this.company = company;
        this.buttonLabel = buttonLabel;
        this.seatRervation = seatRervation;
    }
}
