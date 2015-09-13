package alberto.example.com.tableview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

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
    LinearLayout mSeatTextContainer;
    LinearLayout mSeatIconContainer;
    Button mButton;

    Context mContext;

    public JourneyViewHolder(View itemView, Context context) {
        super(itemView);
        mContext = context;
        mDepartureStation = (TextView) itemView.findViewById(R.id.departure_station);
        mDepartureStatus = (TextView) itemView.findViewById(R.id.departure_status);
        mDepartureTime = (TextView) itemView.findViewById(R.id.departure_time);
        mTrainInfo = (TextView) itemView.findViewById(R.id.train_company);
        mArrivalTime = (TextView) itemView.findViewById(R.id.arrival_time);
        mArrivalStation = (TextView) itemView.findViewById(R.id.arrival_station);
        mButton = (Button) itemView.findViewById(R.id.button);
        mSeatTextContainer = (LinearLayout) itemView.findViewById(R.id.seat_container);
        mSeatIconContainer = (LinearLayout) itemView.findViewById(R.id.seat_icon_container);
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

    public void setSeatReservations(List<String> reservations) {
        mSeatTextContainer.removeAllViews();
        mSeatIconContainer.removeAllViews();
        if (reservations != null && reservations.size() > 0) {
            mSeatTextContainer.setVisibility(View.VISIBLE);
            mSeatIconContainer.setVisibility(View.VISIBLE);
            for (String reservation : reservations) {
                mSeatTextContainer.addView(createReservationView(reservation));
                mSeatIconContainer.addView(createReservationIcon());
            }
        }else{
            mSeatTextContainer.setVisibility(View.GONE);
            mSeatIconContainer.setVisibility(View.GONE);
        }
    }

    private View createReservationIcon() {
        SeatReservationIconContainer image = new SeatReservationIconContainer(mContext);
        return image;

    }

    private View createReservationView(String reservationText) {
        SeatReservationTextContainer textContainer = new SeatReservationTextContainer(mContext);
        textContainer.setSeatReservationText(reservationText);
        return textContainer;
    }

}