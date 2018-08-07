package com.abbyy.mobile.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity {

    private TextView nameTextView;
    private TextView countryTextView;
    private TextView birthDateView;
    private TextView sexTextView;
    private TextView expiryDateView;
    private TextView passportNoView;
    private TextView NationalityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nameTextView = (TextView) findViewById( R.id.nameView );
        countryTextView = (TextView) findViewById( R.id.countryView );
        birthDateView = (TextView) findViewById( R.id.birthDateView );
        sexTextView = (TextView) findViewById( R.id.sexView );
        expiryDateView = (TextView) findViewById( R.id.expiryView );
        passportNoView = (TextView) findViewById( R.id.passportNo );
        NationalityView = (TextView) findViewById( R.id.NationalityView );

        Button buttonBack = (Button) findViewById(R.id.button_back);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String surname = bundle.getString("surname");
            String country = bundle.getString("country");
            String birthDate = bundle.getString("birthDate");
            String sex = bundle.getString("sex");
            String expiry = bundle.getString("expiry");
            String passportNo = bundle.getString("passportNo");
            String nationality = bundle.getString("nationality");

            passportNoView.setText("Passport No. : " + passportNo);
            nameTextView.setText("Name : " + name + "\nSurname : " + surname);
            countryTextView.setText("Country : " + country);
            NationalityView.setText("Nationality : " + nationality);
            birthDateView.setText("Date of Birth : " + birthDate.substring(4, 6) + " / " +
            birthDate.substring(2, 4) + " / 19" + birthDate.substring(0, 2));
            sexTextView.setText("Sex : " + sex);
            expiryDateView.setText("Expiry of Date : " + expiry.substring(4, 6) + " / " +
                    expiry.substring(2, 4) + " / 20" + expiry.substring(0, 2));

        }
    }
}