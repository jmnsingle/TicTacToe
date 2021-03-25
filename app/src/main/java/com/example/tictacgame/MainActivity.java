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

    String btn1Text = "";
    String btn2Text = "";
    String btn3Text = "";
    String btn4Text = "";
    String btn5Text = "";
    String btn6Text = "";
    String btn7Text = "";
    String btn8Text = "";
    String btn9Text = "";

    String winner = "Nobody";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWinner (String btn1, String btn2, String btn3, String btn4, String btn5, String btn6, String btn7, String btn8, String btn9) {
        //for(int j = 1; j < 7; j++){
        //    System.out.println(results[j][0] + "<->" + results[j][1] + "<->" + results[j][2]);
        //}

        if (
                btn1 == "x" && btn2 == "x" && btn3 == "x" ||
                        btn4 == "x" && btn5 == "x" && btn6 == "x" ||
                        btn7 == "x" && btn8 == "x" && btn9 == "x" ||
                        btn1 == "x" && btn4 == "x" && btn7 == "x" ||
                        btn2 == "x" && btn5 == "x" && btn8 == "x" ||
                        btn3 == "x" && btn6 == "x" && btn9 == "x" ||
                        btn1 == "x" && btn5 == "x" && btn9 == "x" ||
                        btn3 == "x" && btn5 == "x" && btn7 == "x"
        ) {
            winner = "X";
            System.out.println("WINNER => " + winner);
        } else if (
                btn1 == "o" && btn2 == "o" && btn3 == "o" ||
                        btn4 == "o" && btn5 == "o" && btn6 == "o" ||
                        btn7 == "o" && btn8 == "o" && btn9 == "o" ||
                        btn1 == "o" && btn4 == "o" && btn7 == "o" ||
                        btn2 == "o" && btn5 == "o" && btn8 == "o" ||
                        btn3 == "o" && btn6 == "o" && btn9 == "o" ||
                        btn1 == "o" && btn5 == "o" && btn9 == "o" ||
                        btn3 == "o" && btn5 == "o" && btn7 == "o"
        ) {
            winner = "O";
            System.out.println("WINNER => " + winner);
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

        switch (view.getId()) {
            case R.id.btn1:
                if (btn1Text == "") {
                    if (currentPlayer == "X") {
                        btn1.setText("x");
                        sequencyPlayer1 += "btn1";
                    } else {
                        btn1.setText("o");
                    }
                    btn1Text = btn1.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn2:
                if (btn2Text == "") {
                    if (currentPlayer == "X") {
                        btn2.setText("x");
                    } else {
                        btn2.setText("o");
                    }
                    btn2Text = btn2.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn3:
                if (btn3Text == "") {
                    if (currentPlayer == "X") {
                        btn3.setText("x");
                    } else {
                        btn3.setText("o");
                    }
                    btn3Text = btn3.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn4:
                if (btn4Text == "") {
                    if (currentPlayer == "X") {
                        btn4.setText("x");
                    } else {
                        btn4.setText("o");
                    }
                    btn4Text = btn4.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }

                break;
            case R.id.btn5:
                if (btn5Text == "") {
                    if (currentPlayer == "X") {
                        btn5.setText("x");
                    } else {
                        btn5.setText("o");
                    }
                    btn5Text = btn5.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn6:
                if (btn6Text == "") {
                    if (currentPlayer == "X") {
                        btn6.setText("x");
                    } else {
                        btn6.setText("o");
                    }
                    btn6Text = btn6.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn7:
                if (btn7Text == "") {
                    if (currentPlayer == "X") {
                        btn7.setText("x");
                    } else {
                        btn7.setText("o");
                    }
                    btn7Text = btn7.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            case R.id.btn8:
                if (btn8Text == "") {
                    if (currentPlayer == "X") {
                        btn8.setText("x");
                    } else {
                        btn8.setText("o");
                    }
                    btn8Text = btn8.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
                break;
            default:
                if (btn9Text == "") {
                    if (currentPlayer == "X") {
                        btn9.setText("x");
                    } else {
                        btn9.setText("o");
                    }
                    btn9Text = btn9.getText().toString();
                    if (currentPlayer == "X") {
                        currentPlayer = "O";
                    } else {
                        currentPlayer = "X";
                    }
                }
            break;
        }

        getWinner(btn1Text, btn2Text, btn3Text, btn4Text, btn5Text, btn6Text, btn7Text, btn8Text, btn9Text);

        if (winner == "X" || winner == "O") {
            /*btn1.setText("w");
            btn2.setText("w");
            btn3.setText("w");
            btn4.setText("w");
            btn5.setText("w");
            btn6.setText("w");
            btn7.setText("w");
            btn8.setText("w");
            btn9.setText("w");*/
        }


    }
}