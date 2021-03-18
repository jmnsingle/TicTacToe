package com.example.tictacgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String player1 = "O";
    String player2 = "X";
    String btnText = "";

    String currentPlayer = "O";
    String sequencyPlayer1 = "";
    String sequencyPlayer2 = "";

    int [][] results = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9},

            {1,4,7},
            {2,5,8},
            {3,6,9},

            {1,5,9},
            {3,5,7},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWinner () {
        for(int j = 0; j<=7; j++){
            System.out.println(results[j][0] + "<->" + results[j][1] + "<->" + results[j][2]);
        }
    }

    public void setButtonText(View view) {
        Button btn1 = (Button) view.findViewById(R.id.btn1);
        Button btn2 = (Button) view.findViewById(R.id.btn2);
        Button btn3 = (Button) view.findViewById(R.id.btn3);
        Button btn4 = (Button) view.findViewById(R.id.btn4);
        Button btn5 = (Button) view.findViewById(R.id.btn5);
        Button btn6 = (Button) view.findViewById(R.id.btn6);
        Button btn7 = (Button) view.findViewById(R.id.btn7);
        Button btn8 = (Button) view.findViewById(R.id.btn8);
        Button btn9 = (Button) view.findViewById(R.id.btn9);
        btnText = "";
        switch (view.getId()) {
            case R.id.btn1:
                getWinner();
                btnText = btn1.getText().toString();
                System.out.println("BTN " + btnText.toString());
                //if (btnText == " ") {
                    if (currentPlayer == "X") {
                        btn1.setText("X");
                        sequencyPlayer1 += "btn1";
                    } else {
                        btn1.setText("O");
                    }
                //}
                break;
            case R.id.btn2:
                btnText = btn2.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn2.setText("X");
                    } else {
                        btn2.setText("O");
                    }
                //}
                break;
            case R.id.btn3:
                btnText = btn3.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn3.setText("X");
                    } else {
                        btn3.setText("O");
                    }
                //}
                break;
            case R.id.btn4: btnText = btn4.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn4.setText("X");
                    } else {
                        btn4.setText("O");
                    }
                //}

                break;
            case R.id.btn5:
                btnText = btn5.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn5.setText("X");
                    } else {
                        btn5.setText("O");
                    }
                //}
                break;
            case R.id.btn6:
                btnText = btn6.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn6.setText("X");
                    } else {
                        btn6.setText("O");
                    }
                //}
                break;
            case R.id.btn7:
                btnText = btn7.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn7.setText("X");
                    } else {
                        btn7.setText("O");
                    }
                //}
                break;
            case R.id.btn8:
                btnText = btn8.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn8.setText("X");
                    } else {
                        btn8.setText("O");
                    }
                //}
                break;
            default:
                btnText = btn9.getText().toString();
                //if (btnText == "") {
                    if (currentPlayer == "X") {
                        btn9.setText("X");
                    } else {
                        btn9.setText("O");
                    }
                //}
            break;
        }

        if (currentPlayer == "X") {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

    }
}