package alberto.example.com.tableview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Alberto Velo Carrasco on 12/09/15.
 */
public class JourneyViewHolder extends RecyclerView.ViewHolder {

    TextView mDepartureTime;
    TextView mDepartureStatus;
    TextView mTrainInfo;
    TextView mArrivalTime;
    TextView mDepartureStation;
    TextView mArrivalStation;
    Button mButton;

    public JourneyViewHolder(View itemView) {
        super(itemView);
        mDepartureStation = (TextView) itemView.findViewById(R.id.departure_station);
        mDepartureStatus = (TextView) itemView.findViewById(R.id.departure_status);
        mDepartureTime = (TextView) itemView.findViewById(R.id.departure_time);
        mTrainInfo = (TextView) itemView.findViewById(R.id.train_company);
        mArrivalTime = (TextView) itemView.findViewById(R.id.arrival_time);
        mArrivalStation = (TextView) itemView.findViewById(R.id.arrival_station);
        mButton = (Button) itemView.findViewById(R.id.button);
    }

    public void setDepartureStation(String station) {
        mDepartureStation.setText(station);
    }

    public void setArrivalStation(String station) {
        mArrivalStation.setText(station);
    }

    public void setDepartureStatus(String status) {
        mDepartureStatus.setText(status);
    }

    public void setDepartureTime(String time) {
        mDepartureTime.setText(time);
    }

    public void setArrivalTime(String time) {
        mArrivalTime.setText(time);
    }

    public void setCompanyName(String name) {
        mTrainInfo.setText(name);
    }

    public void setButtonLabel(String name) {
        if (name == null) {
            mButton.setVisibility(View.GONE);
        } else {
            mButton.setVisibility(View.VISIBLE);
            mButton.setText(name);
        }
    }

}