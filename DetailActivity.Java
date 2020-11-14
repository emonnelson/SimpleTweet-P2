import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    Tweet tweet;
    TextView tvName;
    TextView tvSName;
    TextView tvB;
    ImageView iProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tvName);
        tvSName = findViewById(R.id.tvSName);
        tvB = findViewById(R.id.tvB);
        iProfile = findViewById(R.id.iProfile);

        tweet = (Tweet) Parcels.unwrap(getIntent().getParcelableExtra("tweet"));
        tvName.setText(tweet.user.name);
        tvSName.setText("@" + tweet.user.screenName);
        tvB.setText(tweet.body);
        Glide.with(this).load(tweet.user.profileImageUrl)
                .into(iProfile);


    }
}

