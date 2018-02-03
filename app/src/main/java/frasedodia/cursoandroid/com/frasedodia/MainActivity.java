package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases={"Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos" , "Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência","Se você não está disposto a arriscar, esteja disposto a uma vida comum","Para de perseguir o dinheiro e comece a perseguir o sucesso"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();

                int numeroaleatorio = randomico.nextInt(frases.length) ;

                textoNovaFrase.setText(frases[numeroaleatorio]);
            }
        });
    }
}
