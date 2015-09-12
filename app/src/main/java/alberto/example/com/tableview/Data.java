package alberto.example.com.tableview;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (departureTime != null ? !departureTime.equals(data.departureTime)
                                  : data.departureTime != null) return false;
        if (departureStatus != null ? !departureStatus.equals(data.departureStatus)
                                    : data.departureStatus != null) return false;
        if (arrivalTime != null ? !arrivalTime.equals(data.arrivalTime) : data.arrivalTime != null)
            return false;
        if (originStationName != null ? !originStationName.equals(data.originStationName)
                                      : data.originStationName != null) return false;
        if (destinationStationName != null ? !destinationStationName
                .equals(data.destinationStationName)
                                           : data.destinationStationName != null) return false;
        if (company != null ? !company.equals(data.company) : data.company != null) return false;
        return !(buttonLabel != null ? !buttonLabel.equals(data.buttonLabel)
                                     : data.buttonLabel != null);

    }

    @Override
    public int hashCode() {
        int result = departureTime != null ? departureTime.hashCode() : 0;
        result = 31 * result + (departureStatus != null ? departureStatus.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (originStationName != null ? originStationName.hashCode() : 0);
        result = 31 * result + (destinationStationName != null ? destinationStationName.hashCode()
                                                               : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (buttonLabel != null ? buttonLabel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Data{" +
                "departureTime='" + departureTime + '\'' +
                ", departureStatus='" + departureStatus + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", originStationName='" + originStationName + '\'' +
                ", destinationStationName='" + destinationStationName + '\'' +
                ", company='" + company + '\'' +
                ", buttonLabel='" + buttonLabel + '\'' +
                '}';
    }
}
