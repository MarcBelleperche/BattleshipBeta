package belleperche.mb2.battleshipbeta;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GAMESCREEN extends AppCompatActivity {

    Button bouton1,bouton2,bouton3,bouton4,bouton5,bouton6,bouton7,bouton8,bouton9,bouton10,bouton11,bouton12,bouton13,bouton14,bouton15,bouton16;
    int couleur1 =0,couleur2 =0,couleur3 =0,couleur4 =0,couleur5 =0,couleur6 =0,couleur7 =0,couleur8 =0,couleur9 =0,couleur10 =0,couleur11 =0,couleur12 =0,couleur13 =0,couleur14 =0,couleur15 =0,couleur16 =0;
    int mov=2;
    int nbbateau=2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);

        bouton1 = (Button)findViewById(R.id.bouton1);
        bouton2 = (Button)findViewById(R.id.bouton2);
        bouton3 = (Button)findViewById(R.id.bouton3);
        bouton4 = (Button)findViewById(R.id.bouton4);
        bouton5 = (Button)findViewById(R.id.bouton5);
        bouton6 = (Button)findViewById(R.id.bouton6);
        bouton7 = (Button)findViewById(R.id.bouton7);
        bouton8 = (Button)findViewById(R.id.bouton8);
        bouton9 = (Button)findViewById(R.id.bouton9);
        bouton10 = (Button)findViewById(R.id.bouton10);
        bouton11 = (Button)findViewById(R.id.bouton11);
        bouton12 = (Button)findViewById(R.id.bouton12);
        bouton13 = (Button)findViewById(R.id.bouton13);
        bouton14 = (Button)findViewById(R.id.bouton14);
        bouton15 = (Button)findViewById(R.id.bouton15);
        bouton16 = (Button)findViewById(R.id.bouton16);
        textView = new TextView(this);

        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0)
                {
                TIR(couleur1,bouton1);
                }
                else if(couleur1 == 0)
                {bouton1.setBackgroundColor(Color.YELLOW);
                couleur1++;
                mov--;
                Mouvement(mov);}
                else {bouton1.setBackgroundColor(Color.BLUE);
                couleur1--;mov++;
                    Mouvement(mov);}

            }
        });
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                if (mov == 0)
                {
                TIR(couleur2,bouton2);
                }
                else if (couleur2 == 0)
                {bouton2.setBackgroundColor(Color.YELLOW);
                    couleur2++;
                    mov--;
                    Mouvement(mov);}
                else {bouton2.setBackgroundColor(Color.BLUE);
                    couleur2--;mov++;}
            }
        });
        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                if (mov == 0)
                {
                TIR(couleur3,bouton3);
                }
                else if (couleur3 == 0)
                {bouton3.setBackgroundColor(Color.YELLOW);
                    couleur3++;
                    mov--;
                    Mouvement(mov);}
                else {bouton3.setBackgroundColor(Color.BLUE);
                    couleur3--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur4,bouton4);
                }
                else if (couleur4 == 0)
                {bouton4.setBackgroundColor(Color.YELLOW);
                    couleur4++;
                    mov--;
                    Mouvement(mov);}
                else {bouton4.setBackgroundColor(Color.BLUE);
                    couleur4--; mov++;
                    mov--;
                    Mouvement(mov);}
            }
        });
        bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur5,bouton5);
                }
                else if (couleur5 == 0)
                {bouton5.setBackgroundColor(Color.YELLOW);
                    couleur5++;
                    mov--;
                    Mouvement(mov);}
                else {bouton5.setBackgroundColor(Color.BLUE);
                    couleur5--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur6,bouton6);
                }
                else if (couleur6 == 0)
                {bouton6.setBackgroundColor(Color.YELLOW);
                    couleur6++;
                    mov--;
                    Mouvement(mov);}
                else {bouton6.setBackgroundColor(Color.BLUE);
                    couleur6--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur7,bouton7);
                }
                else if (couleur7 == 0)
                {bouton7.setBackgroundColor(Color.YELLOW);
                    couleur7++;
                    mov--;
                    Mouvement(mov);}
                else {bouton7.setBackgroundColor(Color.BLUE);
                    couleur7--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur8,bouton8);
                }
                else if (couleur8 == 0)
                {bouton8.setBackgroundColor(Color.YELLOW);
                    couleur8++;
                    mov--;
                    Mouvement(mov);}
                else {bouton8.setBackgroundColor(Color.BLUE);
                    couleur8--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur9,bouton9);
                }
                else if (couleur9 == 0)
                {bouton9.setBackgroundColor(Color.YELLOW);
                    couleur9++;
                    mov--;
                    Mouvement(mov);}
                else {bouton9.setBackgroundColor(Color.BLUE);
                    couleur9--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur10,bouton10);
                }
                else if (couleur10 == 0)
                {bouton10.setBackgroundColor(Color.YELLOW);
                    couleur10++;
                    mov--;
                    Mouvement(mov);}
                else {bouton10.setBackgroundColor(Color.BLUE);
                    couleur10--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mov == 0 ){
                    TIR(couleur11,bouton11);
                }
                else if (couleur11 == 0)
                {bouton11.setBackgroundColor(Color.YELLOW);
                    couleur11++;
                    mov--;
                    Mouvement(mov);}
                else {bouton11.setBackgroundColor(Color.BLUE);
                    couleur11--; mov++;
                    Mouvement(mov);}            }
        });
        bouton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur12,bouton12);
                }
                else if (couleur12 == 0)
                {bouton12.setBackgroundColor(Color.YELLOW);
                    couleur12++;
                    mov--;
                    Mouvement(mov);}
                else {bouton12.setBackgroundColor(Color.BLUE);
                    couleur12--; mov++;
                    Mouvement(mov);}
            }
        });
        bouton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur13,bouton13);
                }
                else if (couleur13 == 0)
                {bouton13.setBackgroundColor(Color.YELLOW);
                    couleur13++;
                    mov--;
                    Mouvement(mov);}
                else {bouton13.setBackgroundColor(Color.BLUE);
                    couleur13--; mov++;
                    Mouvement(mov);}            }
        });
        bouton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur14,bouton14);
                }
                else if (couleur14 == 0)
                {bouton14.setBackgroundColor(Color.YELLOW);
                    couleur14++;
                    mov--;
                    Mouvement(mov);}
                else {bouton14.setBackgroundColor(Color.BLUE);
                    couleur14--; mov++;
                    Mouvement(mov);}            }
        });
        bouton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur15,bouton15);
                }
                else if (couleur15 == 0)
                {bouton15.setBackgroundColor(Color.YELLOW);
                    couleur15++;
                    mov--;
                    Mouvement(mov);}
                else {bouton15.setBackgroundColor(Color.BLUE);
                    couleur15--; mov++;
                    Mouvement(mov);}            }
        });
        bouton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 ){
                    TIR(couleur16,bouton16);
                }
                else if (couleur16 == 0)
                {bouton16.setBackgroundColor(Color.YELLOW);
                    couleur16++;
                    mov--;
                    Mouvement(mov);}
                else {bouton16.setBackgroundColor(Color.BLUE);
                    couleur16--; mov++;
                    Mouvement(mov);}            }
        });
    }

    public void Mouvement(int youyou)
    {
        Context context = getApplicationContext();
        CharSequence text = "Mouvment(s)restant(s) :"+youyou;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();}

    public void TOUCHER(int nbbateau)
    {
        Context context = getApplicationContext();
        CharSequence text = "TOUCHER :"+nbbateau;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();}

    public void TIR(int couleur,Button nbbouton){
        if (nbbateau == 0)
        {

            textView.setTextSize(40);
            textView.setText("GAGNER");
            textView.setGravity(View.TEXT_ALIGNMENT_CENTER);}
        else if (couleur ==0)
        {nbbouton.setBackgroundColor(Color.GRAY);}
        else
        {nbbouton.setBackgroundColor(Color.RED);
        nbbateau--;
        TOUCHER(nbbateau);}
    }

}
