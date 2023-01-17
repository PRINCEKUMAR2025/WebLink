package com.example.openweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button next;
    ImageButton contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);
        contact=findViewById(R.id.contact);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.openweb.next.class);
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.openweb.contact.class);
                startActivity(intent);
            }
        });
    }
    public void launchfb(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjczNTk5MTIxLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D"));
        startActivity(intent);
    }

    public void launchwhatsapp(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://web.whatsapp.com/"));
        startActivity(intent);
    }

    public void launchspot(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://open.spotify.com/"));
        startActivity(intent);
    }

    public void launchtele(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://web.telegram.org/"));
        startActivity(intent);
    }

    public void launchzomat(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.zomato.com/"));
        startActivity(intent);
    }

    public void launchinsta(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/"));
        startActivity(intent);
    }

    public void launchamaz(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.amazon.in/"));
        startActivity(intent);
    }

    public void launchneflix(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.netflix.com/in/"));
        startActivity(intent);
    }

    public void launchprime(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_gm_170_mkw_sPL46i7Lo-dc&mrntrk=pcrid_610141119732_slid__pgrid_84577172328_pgeo_9300146_x__adext__ptid_kwd-61602341"));
        startActivity(intent);
    }

    public void launchdiscord(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://discord.com/login"));
        startActivity(intent);
    }

    public void launchuber(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://auth.uber.com/v2/?breeze_local_zone=phx6&next_url=https%3A%2F%2Fm.uber.com%2F&state=lYJUZ5aohtakY7TNp5ASAr1WKIUpT4NISE77BAlUvZo%3D"));
        startActivity(intent);
    }

    public void launchmail(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
        startActivity(intent);
    }

    public void launchchrome(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/intl/en_in/chrome/"));
        startActivity(intent);
    }

    public void launchteams(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=5e3ce6c0-2b1f-4285-8d4b-75ee78787346&redirect_uri=https%3A%2F%2Fteams.microsoft.com%2Fgo&state=eyJpZCI6IjNiNThlYTU5LTZiYWQtNGQ5My1hNzhmLWVmMGYyZGU0OTAzOCIsInRzIjoxNjczNTk5ODE5LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=b6ea7e7d-d6bd-4517-977f-0387248f0e88&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.3.4&client-request-id=e5bc99b6-eb76-4e40-a69a-23ac585eb2fa&response_mode=fragment"));
        startActivity(intent);
    }

    public void launchgit(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/"));
        startActivity(intent);
    }
}