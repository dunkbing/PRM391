package com.dangbinh.moneymanagement.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.dangbinh.moneymanagement.models.Transaction;
import com.dangbinh.moneymanagement.R;
import com.dangbinh.moneymanagement.utils.Constants;

import java.util.List;

public class TaxEstimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tax_estimator);

        /*Firebase trans_ref = new Firebase(Constants.FIREBASE_URL);
        Firebase ref = trans_ref.child("Transactions/" + trans_ref.getAuth().getUid());
        //Map<String,Integer> m = new HashMap<String,Integer>();

        // Attach an listener to read the data at our posts reference
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                //String cat = snapshot.getValue(String.class);
                //Log.d("data",cat);
                //DataSnapshot elections = snapshot.child("Transaction");
                for (DataSnapshot data : snapshot.getChildren()) {
                    String electionName = data.toString();
                    Log.d("Value", electionName);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Log.d("failed", firebaseError.toString());
                //System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });*/
    }

    public void calculate_tax(List<Transaction> td) {
        for (Transaction item : td) {
            Log.d("data is", item.getCategory());
            // body
        }
    }
}