package belleperche.mb2.battleshipbeta;

import android.content.Context;
import android.content.Intent;
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

    Button bouton1,bouton2,bouton3,bouton4,bouton5,bouton6,bouton7,bouton8,bouton9,bouton10,bouton11,bouton12,bouton13,bouton14,bouton15,bouton16,DONE,TIR;
    int couleur1 =0,couleur2 =0,couleur3 =0,couleur4 =0,couleur5 =0,couleur6 =0,couleur7 =0,couleur8 =0,couleur9 =0,couleur10 =0,couleur11 =0,couleur12 =0,couleur13 =0,couleur14 =0,couleur15 =0,couleur16 =0;
    int couleurj1 =0,couleurj2 =0,couleurj3 =0,couleurj4 =0,couleurj5 =0,couleurj6 =0,couleurj7 =0,couleurj8 =0,couleurj9 =0,couleurj10 =0,couleurj11 =0,couleurj12 =0,couleurj13 =0,couleurj14 =0,couleurj15 =0,couleurj16 =0;
    int etat1 =1,etat2 =1,etat3 =1,etat4 =1,etat5 =1,etat6 =1,etat7 =1,etat8 =1,etat9 =1,etat10 =1,etat11 =1,etat12 =1,etat13 =1,etat14 =1,etat15 =1,etat16 =1;
    int etatj1 =1,etatj2 =1,etatj3 =1,etatj4 =1,etatj5 =1,etatj6 =1,etatj7 =1,etatj8 =1,etatj9 =1,etatj10 =1,etatj11 =1,etatj12 =1,etatj13 =1,etatj14 =1,etatj15 =1,etatj16 =1;
    int mov=2;
    int mov2=2;
    int nbbateau=2;
    int nbbateau2=2;
    int joueur=1;
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

        DONE = (Button)findViewById(R.id.DONE);
        TIR = (Button)findViewById(R.id.TIR); 
        textView = new TextView(this);

        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mov == 0 )
                {
                    if (mov2 == 0){
                        TIR(couleur1,couleurj1,bouton1,etat1,etatj1);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj1 == 0) {
                        bouton1.setBackgroundColor(Color.YELLOW);
                        couleurj1++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton1.setBackgroundColor(Color.BLUE);
                    couleurj1--;mov2++;
                    Mouvement(mov2);}
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
                    bouton2.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur2,couleurj2,bouton2,etat2,etatj2);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj2 == 0) {
                        bouton2.setBackgroundColor(Color.YELLOW);
                        couleurj2++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton2.setBackgroundColor(Color.BLUE);
                        couleurj2--;mov2++;
                        Mouvement(mov2);}
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
                    bouton3.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur3,couleurj3,bouton3,etat3,etatj3);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj3 == 0) {
                        bouton3.setBackgroundColor(Color.YELLOW);
                        couleurj3++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton3.setBackgroundColor(Color.BLUE);
                        couleurj3--;mov2++;
                        Mouvement(mov2);}
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
                    bouton4.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur4,couleurj4,bouton4,etat4,etatj4);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj4 == 0) {
                        bouton4.setBackgroundColor(Color.YELLOW);
                        couleurj4++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton4.setBackgroundColor(Color.BLUE);
                        couleurj4--;mov2++;
                        Mouvement(mov2);}
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
                    bouton5.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur5,couleurj5,bouton5,etat5,etatj5);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj5 == 0) {
                        bouton5.setBackgroundColor(Color.YELLOW);
                        couleurj5++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton5.setBackgroundColor(Color.BLUE);
                        couleurj5--;mov2++;
                        Mouvement(mov2);}
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
                    bouton6.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur6,couleurj6,bouton6,etat6,etatj6);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj6 == 0) {
                        bouton6.setBackgroundColor(Color.YELLOW);
                        couleurj6++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton6.setBackgroundColor(Color.BLUE);
                        couleurj6--;mov2++;
                        Mouvement(mov2);}
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
                    bouton7.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur7,couleurj7,bouton7,etat7,etatj7);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj7 == 0) {
                        bouton7.setBackgroundColor(Color.YELLOW);
                        couleurj7++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton7.setBackgroundColor(Color.BLUE);
                        couleurj7--;mov2++;
                        Mouvement(mov2);}
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
                    bouton8.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur8,couleurj8,bouton8,etat8,etatj8);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj8 == 0) {
                        bouton8.setBackgroundColor(Color.YELLOW);
                        couleurj8++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton8.setBackgroundColor(Color.BLUE);
                        couleurj8--;mov2++;
                        Mouvement(mov2);}
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
                    bouton9.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur9,couleurj9,bouton9,etat9,etatj9);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj9 == 0) {
                        bouton9.setBackgroundColor(Color.YELLOW);
                        couleurj9++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton9.setBackgroundColor(Color.BLUE);
                        couleurj9--;mov2++;
                        Mouvement(mov2);}
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
                    bouton10.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur10,couleurj10,bouton10,etat10,etatj10);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj10 == 0) {
                        bouton10.setBackgroundColor(Color.YELLOW);
                        couleurj10++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton10.setBackgroundColor(Color.BLUE);
                        couleurj10--;mov2++;
                        Mouvement(mov2);}
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
                    bouton11.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur11,couleurj11,bouton11,etat11,etatj11);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj11 == 0) {
                        bouton11.setBackgroundColor(Color.YELLOW);
                        couleurj11++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton11.setBackgroundColor(Color.BLUE);
                        couleurj11--;mov2++;
                        Mouvement(mov2);}
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
                    bouton12.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur12,couleurj12,bouton12,etat12,etatj12);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj12 == 0) {
                        bouton12.setBackgroundColor(Color.YELLOW);
                        couleurj12++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton12.setBackgroundColor(Color.BLUE);
                        couleurj12--;mov2++;
                        Mouvement(mov2);}
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
                    bouton13.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur13,couleurj13,bouton13,etat13,etatj13);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj13 == 0) {
                        bouton13.setBackgroundColor(Color.YELLOW);
                        couleurj13++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton13.setBackgroundColor(Color.BLUE);
                        couleurj13--;mov2++;
                        Mouvement(mov2);}
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
                    bouton14.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur14,couleurj14,bouton14,etat14,etatj14);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj14 == 0) {
                        bouton14.setBackgroundColor(Color.YELLOW);
                        couleurj14++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton14.setBackgroundColor(Color.BLUE);
                        couleurj14--;mov2++;
                        Mouvement(mov2);}
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
                    bouton15.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur15,couleurj15,bouton15,etat15,etatj15);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj15 == 0) {
                        bouton15.setBackgroundColor(Color.YELLOW);
                        couleurj15++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton15.setBackgroundColor(Color.BLUE);
                        couleurj15--;mov2++;
                        Mouvement(mov2);}
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
                    bouton16.setBackgroundColor(Color.BLUE);
                    if (mov2 == 0){
                        TIR(couleur16,couleurj16,bouton16,etat16,etatj16);
                        WIN(nbbateau,nbbateau2);
                    }
                    else if (couleurj16 == 0) {
                        bouton16.setBackgroundColor(Color.YELLOW);
                        couleurj16++;
                        mov2--;
                        Mouvement(mov2);
                    }
                    else {bouton16.setBackgroundColor(Color.BLUE);
                        couleurj16--;mov2++;
                        Mouvement(mov2);}
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
        DONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bouton1.setBackgroundColor(Color.BLUE);
                bouton2.setBackgroundColor(Color.BLUE);
                bouton3.setBackgroundColor(Color.BLUE);
                bouton4.setBackgroundColor(Color.BLUE);
                bouton5.setBackgroundColor(Color.BLUE);
                bouton6.setBackgroundColor(Color.BLUE);
                bouton7.setBackgroundColor(Color.BLUE);
                bouton8.setBackgroundColor(Color.BLUE);
                bouton9.setBackgroundColor(Color.BLUE);
                bouton10.setBackgroundColor(Color.BLUE);
                bouton11.setBackgroundColor(Color.BLUE);
                bouton12.setBackgroundColor(Color.BLUE);
                bouton13.setBackgroundColor(Color.BLUE);
                bouton14.setBackgroundColor(Color.BLUE);
                bouton15.setBackgroundColor(Color.BLUE);
                bouton16.setBackgroundColor(Color.BLUE);
            }
        });
        /*TIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (joueur == 1){
                    if (etat1 == 1){bouton1.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat1 == 2 ){bouton1.setBackgroundColor(Color.RED);}
                    else if (etat1 == 0){bouton1.setBackgroundColor(Color.BLUE);}

                    if (etat2 == 1){bouton2.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat2 == 2 ){bouton2.setBackgroundColor(Color.RED);}
                    else if (etat2 == 0){bouton2.setBackgroundColor(Color.BLUE);}

                    if (etat3 == 1){bouton3.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat3 == 2 ){bouton3.setBackgroundColor(Color.RED);}
                    else if (etat3 == 0){bouton3.setBackgroundColor(Color.BLUE);}

                    if (etat4 == 1){bouton4.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat4 == 2 ){bouton4.setBackgroundColor(Color.RED);}
                    else if (etat4 == 0){bouton4.setBackgroundColor(Color.BLUE);}

                    if (etat5 == 1){bouton5.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat5 == 2 ){bouton5.setBackgroundColor(Color.RED);}
                    else if (etat5 == 0){bouton5.setBackgroundColor(Color.BLUE);}

                    if (etat6 == 1){bouton6.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat6 == 2 ){bouton6.setBackgroundColor(Color.RED);}
                    else if (etat6 == 0){bouton6.setBackgroundColor(Color.BLUE);}

                    if (etat7 == 1){bouton7.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat7 == 2 ){bouton7.setBackgroundColor(Color.RED);}
                    else if (etat7 == 0){bouton7.setBackgroundColor(Color.BLUE);}

                    if (etat8 == 1){bouton8.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat8 == 2 ){bouton8.setBackgroundColor(Color.RED);}
                    else if (etat8 == 0){bouton8.setBackgroundColor(Color.BLUE);}

                    if (etat9 == 1){bouton9.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat9 == 2 ){bouton9.setBackgroundColor(Color.RED);}
                    else if (etat9 == 0){bouton9.setBackgroundColor(Color.BLUE);}

                    if (etat10 == 1){bouton10.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat10 == 2 ){bouton10.setBackgroundColor(Color.RED);}
                    else if (etat10 == 0){bouton10.setBackgroundColor(Color.BLUE);}

                    if (etat11 == 1){bouton11.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat11 == 2 ){bouton11.setBackgroundColor(Color.RED);}
                    else if (etat11 == 0){bouton11.setBackgroundColor(Color.BLUE);}

                    if (etat12 == 1){bouton12.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat12 == 2 ){bouton12.setBackgroundColor(Color.RED);}
                    else if (etat12 == 0){bouton12.setBackgroundColor(Color.BLUE);}

                    if (etat13 == 1){bouton13.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat13 == 2 ){bouton13.setBackgroundColor(Color.RED);}
                    else if (etat13 == 0){bouton13.setBackgroundColor(Color.BLUE);}

                    if (etat14 == 1){bouton14.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat14 == 2 ){bouton14.setBackgroundColor(Color.RED);}
                    else if (etat14 == 0){bouton14.setBackgroundColor(Color.BLUE);}

                    if (etat15 == 1){bouton15.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat15 == 2 ){bouton15.setBackgroundColor(Color.RED);}
                    else if (etat15 == 0){bouton15.setBackgroundColor(Color.BLUE);}

                    if (etat16 == 1){bouton16.setBackgroundColor(Color.GRAY);
                    }
                    else if (etat16 == 2 ){bouton16.setBackgroundColor(Color.RED);}
                    else if (etat16 == 0){bouton16.setBackgroundColor(Color.BLUE);}
                }
                else {
                    if (etatj1 == 1){bouton1.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj1 == 2 ){bouton1.setBackgroundColor(Color.RED);}
                    else if (etatj1 == 0){bouton1.setBackgroundColor(Color.BLUE);}

                    if (etatj2 == 1){bouton2.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj2 == 2 ){bouton2.setBackgroundColor(Color.RED);}
                    else if (etatj2 == 0){bouton2.setBackgroundColor(Color.BLUE);}

                    if (etatj3 == 1){bouton3.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj3 == 2 ){bouton3.setBackgroundColor(Color.RED);}
                    else if (etatj3 == 0){bouton3.setBackgroundColor(Color.BLUE);}

                    if (etatj4 == 1){bouton4.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj4 == 2 ){bouton4.setBackgroundColor(Color.RED);}
                    else if (etatj4 == 0){bouton4.setBackgroundColor(Color.BLUE);}

                    if (etatj5 == 1){bouton5.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj5 == 2 ){bouton5.setBackgroundColor(Color.RED);}
                    else if (etatj5 == 0){bouton5.setBackgroundColor(Color.BLUE);}

                    if (etatj6 == 1){bouton6.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj6 == 2 ){bouton6.setBackgroundColor(Color.RED);}
                    else if (etatj6 == 0){bouton6.setBackgroundColor(Color.BLUE);}

                    if (etatj7 == 1){bouton7.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj7 == 2 ){bouton7.setBackgroundColor(Color.RED);}
                    else if (etatj7 == 0){bouton7.setBackgroundColor(Color.BLUE);}

                    if (etatj8 == 1){bouton8.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj8 == 2 ){bouton8.setBackgroundColor(Color.RED);}
                    else if (etatj8 == 0){bouton8.setBackgroundColor(Color.BLUE);}

                    if (etatj9 == 1){bouton9.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj9 == 2 ){bouton9.setBackgroundColor(Color.RED);}
                    else if (etatj9 == 0){bouton9.setBackgroundColor(Color.BLUE);}

                    if (etatj10 == 1){bouton10.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj10 == 2 ){bouton10.setBackgroundColor(Color.RED);}
                    else if (etatj10 == 0){bouton10.setBackgroundColor(Color.BLUE);}

                    if (etatj11 == 1){bouton11.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj11 == 2 ){bouton11.setBackgroundColor(Color.RED);}
                    else if (etatj11 == 0){bouton11.setBackgroundColor(Color.BLUE);}

                    if (etatj12 == 1){bouton12.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj12 == 2 ){bouton12.setBackgroundColor(Color.RED);}
                    else if (etatj12 == 0){bouton12.setBackgroundColor(Color.BLUE);}

                    if (etatj13 == 1){bouton13.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj13 == 2 ){bouton13.setBackgroundColor(Color.RED);}
                    else if (etatj13 == 0){bouton13.setBackgroundColor(Color.BLUE);}

                    if (etatj14 == 1){bouton14.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj14 == 2 ){bouton14.setBackgroundColor(Color.RED);}
                    else if (etatj14 == 0){bouton14.setBackgroundColor(Color.BLUE);}

                    if (etatj15 == 1){bouton15.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj15 == 2 ){bouton15.setBackgroundColor(Color.RED);}
                    else if (etatj15 == 0){bouton15.setBackgroundColor(Color.BLUE);}

                    if (etatj16 == 1){bouton16.setBackgroundColor(Color.GRAY);
                    }
                    else if (etatj16 == 2 ){bouton16.setBackgroundColor(Color.RED);}
                    else if (etatj16 == 0){bouton16.setBackgroundColor(Color.BLUE);}
                }
            }

        });*/
    }



    public void Mouvement(int youyou)
    {
        Context context = getApplicationContext();
        CharSequence text = "Mouvment(s)restant(s) :"+youyou;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();}

    public void Joueur()
    {
        Context context = getApplicationContext();
        CharSequence text = "JOUEUR :"+joueur;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void TOUCHER(int nbbateau)
    {
        Context context = getApplicationContext();
        CharSequence text = "TOUCHER :"+nbbateau;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();}

    public void TIR(int couleur,int couleurj, Button nbbouton,int etat,int etatj){

        if (joueur == 1) {
            Joueur();
            if (couleurj == 0) {
                nbbouton.setBackgroundColor(Color.GRAY);
                joueur++;
            } else {
                nbbouton.setBackgroundColor(Color.RED);
                nbbateau--;
                TOUCHER(nbbateau);
                joueur++;
                etat++;
            }

        }
        else {
            Joueur();
            if (couleur == 0){
                nbbouton.setBackgroundColor(Color.GRAY);
                joueur--;
             }
             else {
                nbbouton.setBackgroundColor(Color.RED);
                nbbateau2--;
                TOUCHER(nbbateau2);
                joueur--;
                etatj ++;
            }

        }
    }

    public void WIN(int nbbateau,int nbbateau2){
        if (nbbateau == 0 || nbbateau2 == 0) {
            bouton1.setText("Y");
            bouton1.setTextColor(Color.WHITE);
            bouton2.setText("O");
            bouton2.setTextColor(Color.WHITE);
            bouton3.setText("U");
            bouton3.setTextColor(Color.WHITE);
            bouton9.setText("W");
            bouton9.setTextColor(Color.WHITE);
            bouton10.setText("I");
            bouton10.setTextColor(Color.WHITE);
            bouton11.setText("N");
            bouton11.setTextColor(Color.WHITE);
        }
    }
}
