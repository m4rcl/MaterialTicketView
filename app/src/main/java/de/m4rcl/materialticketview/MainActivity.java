package de.m4rcl.materialticketview;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCardView ticketView = findViewById(R.id.ticketView);
        RoundedEdgeTreatment roundedEdgeTreatment = new RoundedEdgeTreatment(50);
        ShapeAppearanceModel shapeAppearanceModel = ShapeAppearanceModel.builder() //
                .setLeftEdge(roundedEdgeTreatment) //
                .setRightEdge(roundedEdgeTreatment) //
                .setAllCorners(new RoundedCornerTreatment(20)) //
                .build();
        ticketView.setShapeAppearanceModel(shapeAppearanceModel);
    }

}
