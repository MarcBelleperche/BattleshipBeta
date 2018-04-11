package belleperche.mb2.battleshipbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

    public void play (View view)
    {
        Intent intent = new Intent(this, GAMESCREEN.class);
        //EditText editText = (EditText) findViewById(R.id.chp_saisie);
        //String message = editText.getText().toString();
        //intent.putExtra(MESSAGE_SUPP,message);
        startActivity(intent);
    }
}

