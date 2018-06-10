package wallisonconversormoedas.carmo.com.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder viewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewHolder.editReal = (EditText) findViewById(R.id.edit_real);
        this.viewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.viewHolder.textEuro = (TextView) findViewById(R.id.text_euro);
        this.viewHolder.btnCalcular = (Button) findViewById(R.id.button_calculate);

        this.viewHolder.btnCalcular.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.button_calculate){
           Double value = Double.valueOf(this.viewHolder.editReal.getText().toString());
           this.viewHolder.textDollar.setText(String.format("%.2f",value*3));
           this.viewHolder.textEuro.setText(String.format("%.2f",value*4));
        }
    }

    private void clearValues(){
     this.viewHolder.textDollar.setText("");
     this.viewHolder.textEuro.setText("");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private static class ViewHolder{
        EditText editReal;
        TextView textDollar;
        TextView textEuro;
        Button btnCalcular;
    }
}
