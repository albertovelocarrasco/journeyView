package alberto.example.com.tableview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * Created by Alberto Velo Carrasco on 12/09/15.
 */
public class SeatReservationIconContainer extends RelativeLayout {

    public SeatReservationIconContainer(Context context) {
        super(context);
        init();
    }

    public SeatReservationIconContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SeatReservationIconContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        final LayoutInflater li = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        li.inflate(R.layout.seat_reservation_icon_container, this, true);
    }

}
