package com.example.mhassan.androidnearbyplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TicketPrice extends AppCompatActivity {
    // hna 7gzt 4 spinner 34an a3rf at3aml m3 el spinner eli goa el xml f el design
    Spinner sp;
    Spinner sp1;
    Spinner sp2;
    Spinner sp3;


    //hna 7gzt 4oit variables 34an tsa3dni eni a3rf atl3 rkm el m7ta eli ana h5trha w hn3rf hnst5dmha f eh lma nd5ol goa on create
    int num;
    int num1;
    int firstline;
    int secondline;
    public int result ;
    TextView display_data;
    TextView display_data1;


    // hna 7gzt array of string b2sami elm7tat w asami el5tot
    String lines []= {"الخط الاول","الخط الثاني","الخط الثالث"};
    String firstLine []= {"المرج الجديده","المرج","عزبه النخل","عين شمس","المطريه","حلميه الزيتون","حدائق الزيتون","سراي القبه","حمامات القبه",
            "كوبري القبه","منشيه الصدر","الدمرداش","غمره","الشهداء","عرابي","عبد الناصر","السادات","سعد زغلول","السيده زينب","الملك الصالح",
            "مار جرجس","الزهراء","دار السلام","حائق المعادي","المعادي","ثكنات المعادي","طره البلد","كوتسيكا","طره الاسمنت","المعصره","حدائق حلوان",
            "وادي حوف","جامعه حلوان","عين حلوان","حلوان"};

    String secondLine []={"شبرا الخيمه","كليه الزراعه","المظلات","الخلفاوي","سانت تريزا","روض الفرج","مسره","الشهداء","العتبه","محمد نجيب",
            "السادات","الابرا","الدقي","البحوث","جامعه القاهره","فيصل","الجيزه","ام المصريين","ساقيه مكي","المنيب"};

    String thirdLine []={"الاهرام","كليه البنات","الاستاد","ارض المعارض","العباسيه","عبده باشا","الجيش","باب الشعريه","العتبه"};

    //hna 7gzt 4 adapters 34an amli bihom mn el array of strings eli 3ndi amli b2a el spinner eli f eldesign
    ArrayAdapter <String> adapter;
    ArrayAdapter <String> adapter1;
    ArrayAdapter <String> adapter2;
    ArrayAdapter <String> adapter3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_price);
        //hna 3rft kol spinner b eli mogod fi el xml
        sp  = (Spinner)findViewById(R.id.spinner);
        sp1 = (Spinner)findViewById(R.id.spinner1);
        sp2 = (Spinner)findViewById(R.id.spinner2);
        sp3 = (Spinner)findViewById(R.id.spinner3);

        //hna brdo 3rft el text dol b eli f xml 34an azhr 3dd elm7tat w hidf3 kam fihom
        display_data = (TextView) findViewById(R.id.txt);
        display_data1= (TextView) findViewById(R.id.txt11);

        //hna 3rft kol adapter hi4il eh mn el strings
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,firstLine);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,secondLine);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,thirdLine);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lines);

        //hna d5lt 3la kol spinner hipan fih asami el5tot el adapter eli 4ail asami el5tot
        sp.setAdapter(adapter);
        sp2.setAdapter(adapter);

        /*hna lma ydos 3la spinner el2wla hi5li el spinner eli odmha tgip asami m7tat el5t eli e5taro msln hoa das 3la spinner
         el2wl w e5tar el5t el2wl higplo f elspinner eltani asami m7tat el5t el2wl w hkza*/
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0:
                        firstline = 1;

                        sp1.setAdapter(adapter1);
                        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                switch (i)
                                {
                                    case 0:
                                        num = 1;
                                        break;
                                    case 1:
                                        num = 2;
                                        break;
                                    case 2:
                                        num = 3;
                                        break;
                                    case 3:
                                        num = 4;
                                        break;
                                    case 4:
                                        num = 5;
                                        break;
                                    case 5:
                                        num = 6;
                                        break;
                                    case 6:
                                        num = 7;
                                        break;
                                    case 7:
                                        num = 8;
                                        break;
                                    case 8:
                                        num = 9;
                                        break;
                                    case 9:
                                        num = 10;
                                        break;
                                    case 10:
                                        num = 11;
                                        break;
                                    case 11:
                                        num = 12;
                                        break;
                                    case 12:
                                        num = 13;
                                        break;
                                    case 13:
                                        num = 14;
                                        break;
                                    case 14:
                                        num = 15;
                                        break;
                                    case 15:
                                        num = 16;
                                        break;
                                    case 16:
                                        num = 17;
                                        break;
                                    case 17:
                                        num = 18;
                                        break;
                                    case 18:
                                        num = 19;
                                        break;
                                    case 19:
                                        num = 20;
                                        break;
                                    case 20:
                                        num = 21;
                                        break;
                                    case 21:
                                        num = 22;
                                        break;
                                    case 22:
                                        num = 23;
                                        break;
                                    case 23:
                                        num = 24;
                                        break;
                                    case 24:
                                        num = 25;
                                        break;
                                    case 25:
                                        num = 26;
                                        break;
                                    case 26:
                                        num = 27;
                                        break;
                                    case 27:
                                        num = 28;
                                        break;
                                    case 28:
                                        num = 29;
                                        break;
                                    case 29:
                                        num = 30;
                                        break;
                                    case 30:
                                        num = 31;
                                        break;
                                    case 31:
                                        num = 32;
                                        break;
                                    case 32:
                                        num = 33;
                                        break;
                                    case 33:
                                        num = 34;
                                        break;
                                    case 34:
                                        num = 35;
                                        break;
                                    default:

                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });

                        break;
                    case 1:
                        firstline = 2;

                        sp1.setAdapter(adapter2);
                        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                switch (i)
                                {
                                    case 0:
                                        num = 1;
                                        break;
                                    case 1:
                                        num = 2;
                                        break;
                                    case 2:
                                        num = 3;
                                        break;
                                    case 3:
                                        num = 4;
                                        break;
                                    case 4:
                                        num = 5;
                                        break;
                                    case 5:
                                        num = 6;
                                        break;
                                    case 6:
                                        num = 7;
                                        break;
                                    case 7:
                                        num = 8;
                                        break;
                                    case 8:
                                        num = 9;
                                        break;
                                    case 9:
                                        num = 10;
                                        break;
                                    case 10:
                                        num = 11;
                                        break;
                                    case 11:
                                        num = 12;
                                        break;
                                    case 12:
                                        num = 13;
                                        break;
                                    case 13:
                                        num = 14;
                                        break;
                                    case 14:
                                        num = 15;
                                        break;
                                    case 15:
                                        num = 16;
                                        break;
                                    case 16:
                                        num = 17;
                                        break;
                                    case 17:
                                        num = 18;
                                        break;
                                    case 18:
                                        num = 19;
                                        break;
                                    case 19:
                                        num = 20;
                                        break;
                                    default:

                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case 2:
                        firstline = 3;

                        sp1.setAdapter(adapter3);
                        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                switch (i)
                                {
                                    case 0:
                                        num = 1;
                                        break;
                                    case 1:
                                        num = 2;
                                        break;
                                    case 2:
                                        num = 3;
                                        break;
                                    case 3:
                                        num = 4;
                                        break;
                                    case 4:
                                        num = 5;
                                        break;
                                    case 5:
                                        num = 6;
                                        break;
                                    case 6:
                                        num = 7;
                                        break;
                                    case 7:
                                        num = 8;
                                        break;
                                    case 8:
                                        num = 9;
                                        break;
                                    default:
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        //asdasdasdasdasd






        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0:
                        secondline = 1;

                        sp3.setAdapter(adapter1);
                        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                switch (i)
                                {
                                    case 0:
                                        num1 = 1;
                                        break;
                                    case 1:
                                        num1 = 2;
                                        break;
                                    case 2:
                                        num1 = 3;
                                        break;
                                    case 3:
                                        num1 = 4;
                                        break;
                                    case 4:
                                        num1 = 5;
                                        break;
                                    case 5:
                                        num1 = 6;
                                        break;
                                    case 6:
                                        num1 = 7;
                                        break;
                                    case 7:
                                        num1 = 8;
                                        break;
                                    case 8:
                                        num1 = 9;
                                        break;
                                    case 9:
                                        num1 = 10;
                                        break;
                                    case 10:
                                        num1 = 11;
                                        break;
                                    case 11:
                                        num1 = 12;
                                        break;
                                    case 12:
                                        num1 = 13;
                                        break;
                                    case 13:
                                        num1 = 14;
                                        break;
                                    case 14:
                                        num1 = 15;
                                        break;
                                    case 15:
                                        num1 = 16;
                                        break;
                                    case 16:
                                        num1 = 17;
                                        break;
                                    case 17:
                                        num1 = 18;
                                        break;
                                    case 18:
                                        num1 = 19;
                                        break;
                                    case 19:
                                        num1 = 20;
                                        break;
                                    case 20:
                                        num1 = 21;
                                        break;
                                    case 21:
                                        num1 = 22;
                                        break;
                                    case 22:
                                        num1 = 23;
                                        break;
                                    case 23:
                                        num1 = 24;
                                        break;
                                    case 24:
                                        num1 = 25;
                                        break;
                                    case 25:
                                        num1 = 26;
                                        break;
                                    case 26:
                                        num1 = 27;
                                        break;
                                    case 27:
                                        num1 = 28;
                                        break;
                                    case 28:
                                        num1 = 29;
                                        break;
                                    case 29:
                                        num1 = 30;
                                        break;
                                    case 30:
                                        num1 = 31;
                                        break;
                                    case 31:
                                        num1 = 32;
                                        break;
                                    case 32:
                                        num1 = 33;
                                        break;
                                    case 33:
                                        num1 = 34;
                                        break;
                                    case 34:
                                        num1 = 35;
                                        break;
                                    default:

                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });

                        break;
                    case 1:
                        secondline = 2;

                        sp3.setAdapter(adapter2);
                        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int x, long ib) {
                                switch (x)
                                {
                                    case 0:
                                        num1 = 1;
                                        break;
                                    case 1:
                                        num1 = 2;
                                        break;
                                    case 2:
                                        num1 = 3;
                                        break;
                                    case 3:
                                        num1 = 4;
                                        break;
                                    case 4:
                                        num1 = 5;
                                        break;
                                    case 5:
                                        num1 = 6;
                                        break;
                                    case 6:
                                        num1 = 7;
                                        break;
                                    case 7:
                                        num1 = 8;
                                        break;
                                    case 8:
                                        num1 = 9;
                                        break;
                                    case 9:
                                        num1 = 10;
                                        break;
                                    case 10:
                                        num1 = 11;
                                        break;
                                    case 11:
                                        num1 = 12;
                                        break;
                                    case 12:
                                        num1 = 13;
                                        break;
                                    case 13:
                                        num1 = 14;
                                        break;
                                    case 14:
                                        num1 = 15;
                                        break;
                                    case 15:
                                        num1 = 16;
                                        break;
                                    case 16:
                                        num1 = 17;
                                        break;
                                    case 17:
                                        num1 = 18;
                                        break;
                                    case 18:
                                        num1 = 19;
                                        break;
                                    case 19:
                                        num1 = 20;
                                        break;
                                    default:

                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                    case 2:
                        secondline = 3;

                        sp3.setAdapter(adapter3);
                        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                switch (i)
                                {
                                    case 0:
                                        num1 = 1;
                                        break;
                                    case 1:
                                        num1 = 2;
                                        break;
                                    case 2:
                                        num1 = 3;
                                        break;
                                    case 3:
                                        num1 = 4;
                                        break;
                                    case 4:
                                        num1 = 5;
                                        break;
                                    case 5:
                                        num1 = 6;
                                        break;
                                    case 6:
                                        num1 = 7;
                                        break;
                                    case 7:
                                        num1 = 8;
                                        break;
                                    case 8:
                                        num1 = 9;
                                        break;
                                    default:
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        //a5ri
    }



    //b3ml hna
    public void displayResult(View view) {
        if (firstline ==1)
        {
            if (secondline ==1) {
                if (num >= num1) {
                    result = num - num1 + 1;
                } else {
                    result = num1 - num + 1;
                }
            }


            else if(secondline == 2){
                if (num <= 14) {
                    if(num1 <= 8) {
                        result = ((14 - num + 1) + (8 - num1 +1)) - 1;
                    }
                    else if (num1 >= 8) {
                        result =((14 - num + 1)+(num1 - 8 +1)) -1;
                    }
                }
                else if(num == 15 ) {
                    if(num1 <= 8) {
                        result = ((num - 14 +1)+(8 - num1 +1)) -1;
                    }
                    else if (num1 >= 11){
                        result = ((17 - num +1)+(num1 - 11 +1)) -1;
                    }
                    else if (num1 == 9 || num1 == 10){
                        result = ((num - 14 +1)+(num1 - 8 +1)) -1;
                    }
                }
                else if (num == 16) {
                    if(num1 <= 8) {
                        result = ((num - 14 +1)+(8 - num1 +1)) -1;
                    }
                    else if (num1 >= 11){
                        result = ((17 - num +1)+(num1 - 11 +1)) -1;
                    }
                    else if (num1 == 9 || num1 == 10){
                        result = ((17 - num +1)+(11 - num1 +1)) -1;
                    }
                }
                else if (num >= 17){
                    if(num1 <=11){
                        result = ((num - 17 +1)+(11 - num1 +1)) -1;
                    }
                    else if (num1 >= 11) {
                        result = ((num - 17 +1)+(num1 - 11 +1)) -1;
                    }
                }

            }
            else if (secondline == 3)
            {
                if(num <= 14) {
                    result = ((14 - num +1)+(9 - num1 +1)) ;
                }
                else if (num == 15 || num == 16){
                    result = ((num - 14 +1)+(9 - num1 +1)) ;
                }
                else if (num >= 17){
                    result = ((num - 17 +2)+(9 - num1 +1)) ;
                }
            }
            display_data.setTextSize(18);
            display_data.setText(result+"");
            switch (result){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    display_data1.setTextSize(18);
                    display_data1.setText("3 جنيه");
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    display_data1.setTextSize(18);
                    display_data1.setText("5 جنيه");
                    break;
                default:
                    display_data1.setTextSize(18);
                    display_data1.setText("7 جنيه");
            }
        }
        else if(firstline == 2)
        {
            if(secondline == 1)
            {
                if(num <=8) {
                    if(num1 <= 14) {
                        result = ((8 - num +1)+(14 - num1 +1)) -1;
                    }
                    else if (num1 >= 14) {
                        result = ((8 - num +1)+(num1 - 14 +1)) -1;
                    }
                }
                else if(num == 9 || num == 10) {
                    if(num1 <= 14) {
                        result = ((num - 8 +1)+(14 - num1 +1)) -1;
                    }
                    else if (num1 == 15) {
                        result = ((num - 8 +1)+(num1 - 14 +1)) -1;
                    }
                    else if (num1 == 16) {
                        result = ((11 - num +1)+(17 - num1 +1)) -1;
                    }
                    else if (num1 >= 17) {
                        result = ((11 - num +1)+(17 - num1 +1)) -1;
                    }
                }
                else if (num >= 11) {
                    if(num1 <= 14) {
                        result = ((num - 8 +1)+(14 - num1) +1) -1;
                    }
                    else if (num1 == 15 || num1 == 16) {
                        result = ((num - 11 +1)+(17 - num1 +1)) -1;
                    }
                    else if (num1 >= 17) {
                        result = ((num - 11 +1)+(num1 - 17 +1)) -1;
                    }
                }
            }
            else if (secondline == 2) {
                if (num >= num1) {
                    result = num - num1 + 1;
                } else {
                    result = num1 - num + 1;
                }
            }
            else if (secondline == 3) {
                if (num <= 9) {
                    result = ((9 - num +1)+(9 - num1 +1)) -1;
                }
                else if (num >= 9) {
                    result = ((num - 9 +1)+(9 - num1 +1)) -1;
                }
            }
            display_data.setTextSize(18);
            display_data.setText(result+"");
            switch (result){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    display_data1.setTextSize(18);
                    display_data1.setText("3 جنيه");
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    display_data1.setTextSize(18);
                    display_data1.setText("5 جنيه");
                    break;
                default:
                    display_data1.setTextSize(18);
                    display_data1.setText("7 جنيه");
            }

        }
        else if (firstline == 3)
        {
            if(secondline == 1)
            {
                if (num1 <= 14) {
                    result = ((9 - num +1)+(14 - num1 +1));
                }
                else if (num1 == 15 || num1 == 16) {
                    result = ((9 - num +2)+(num1 - 14 +1));
                }
                else if (num1 >= 17) {
                    result = ((9 - num +2)+(num1 - 17 +1));
                }
            }
            else if (secondline == 2)
            {
                if (num1 <= 8) {
                    result = (9 - num +1)+(8 - num1 +1);
                }
                else if (num1 >= 9) {
                    result = (9 - num +1)+(num1 - 9);
                }
            }
            else if (secondline == 3)
            {
                if (num >= num1) {
                    result = num - num1 + 1;
                } else {
                    result = num1 - num + 1;
                }
            }
            display_data.setTextSize(18);
            display_data.setText(result+"");
            switch (result){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    display_data1.setTextSize(18);
                    display_data1.setText("3 جنيه");
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    display_data1.setTextSize(18);
                    display_data1.setText("5 جنيه");
                    break;
                default:
                    display_data1.setTextSize(18);
                    display_data1.setText("7 جنيه");
            }
        }
    }
}
