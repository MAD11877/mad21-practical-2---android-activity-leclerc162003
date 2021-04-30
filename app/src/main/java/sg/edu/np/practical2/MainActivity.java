package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    User user = new User("hong", "ifhs", 1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug", "create");

//        if (v.followed == false){
//            Button text=(Button)findViewById(R.id.follow);
//            text.setText("follow");
//        }
//        else{
//            Button text=(Button)findViewById(R.id.follow);
//            text.setText("followed");
//        }

        Button button = (Button) findViewById(R.id.follow);
        //button.setTag(1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int status = (Integer) v.getTag();
                if (user.followed == true){

                    button.setText("Follow");
                    user.setFollowed(false);
                }
                else{
                    button.setText("Unfollow");
                    user.setFollowed(true);
                }
            }

        });




    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "Destroy");
    }


}
