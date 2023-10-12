package com.mygy.musicgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static ArrayList<Album> albums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeAlbums();

        RecyclerView rw=findViewById(R.id.recyclerView);
        AlbumRecyclerAdapter adapter=new AlbumRecyclerAdapter(this,albums);
        rw.setAdapter(adapter);
    }
    private void initializeAlbums(){
        Album VosstavshiyIzAda = new Album("Восставший из Ада",R.drawable.via,"Сектор Газа",2000,26972);
        VosstavshiyIzAda.setSongs(new Song[]{
                new Song("Демобилизация","Сектор Газа",VosstavshiyIzAda),
                new Song("Свадьба","Сектор Газа",VosstavshiyIzAda),
                new Song("Рога","Сектор Газа",VosstavshiyIzAda),
                new Song("Сельский туалет","Сектор Газа",VosstavshiyIzAda),
                new Song("Грязная кровь","Сектор Газа",VosstavshiyIzAda),
                new Song("Любовь загробная","Сектор Газа",VosstavshiyIzAda),
                new Song("Чёрный Вурдалак","Сектор Газа",VosstavshiyIzAda),
                new Song("Истребители вампиров","Сектор Газа",VosstavshiyIzAda),
                new Song("Ночь страха","Сектор Газа",VosstavshiyIzAda),
                new Song("Святая война","Сектор Газа",VosstavshiyIzAda),
                new Song("Восставший из ада","Сектор Газа",VosstavshiyIzAda) });

        Album ZloveshieMertvetsi = new Album("Зловещие Мертвецы",R.drawable.zm,"Сектор Газа",1990,12955);
        ZloveshieMertvetsi.setSongs(new Song[]{
                new Song("Ой, ты травушка зелёная","Сектор Газа",ZloveshieMertvetsi),
                new Song("Сифон","Сектор Газа",ZloveshieMertvetsi),
                new Song("Ку-ку","Сектор Газа",ZloveshieMertvetsi),
                new Song("Русский мат","Сектор Газа",ZloveshieMertvetsi),
                new Song("Без вина","Сектор Газа",ZloveshieMertvetsi),
                new Song("Голубой","Сектор Газа",ZloveshieMertvetsi),
                new Song("Страх","Сектор Газа",ZloveshieMertvetsi),
                new Song("Нас ждут из темноты","Сектор Газа",ZloveshieMertvetsi),
                new Song("Вампиры","Сектор Газа",ZloveshieMertvetsi),
                new Song("Моя смерть","Сектор Газа",ZloveshieMertvetsi),
                new Song("Когда помрёшь","Сектор Газа",ZloveshieMertvetsi),
                new Song("Чёрная магия","Сектор Газа",ZloveshieMertvetsi) });

        Album GazovayaAtaka = new Album("Газовая атака",R.drawable.ga,"Сектор Газа",1997,29445);
        GazovayaAtaka.setSongs(new Song[]{
                new Song("Аванс","Сектор Газа",GazovayaAtaka),
                new Song("Свидание","Сектор Газа",GazovayaAtaka),
                new Song("Вылазка","Сектор Газа",GazovayaAtaka),
                new Song("30 лет","Сектор Газа",GazovayaAtaka),
                new Song("LIFE","Сектор Газа",GazovayaAtaka),
                new Song("Туман","Сектор Газа",GazovayaAtaka),
                new Song("Твой звонок","Сектор Газа",GazovayaAtaka),
                new Song("ГАИ (Водительская-подхалимская)","Сектор Газа",GazovayaAtaka),
                new Song("Мак","Сектор Газа",GazovayaAtaka),
                new Song("Чунга-Чанга","Сектор Газа",GazovayaAtaka),
                new Song("Хата","Сектор Газа",GazovayaAtaka),
                new Song("Опарыш","Сектор Газа",GazovayaAtaka) });

        Album YadrenaVosh = new Album("Ядрена вошь",R.drawable.yw,"Сектор Газа",2000,13384);
      YadrenaVosh.setSongs(new Song[]{
              new Song("Мы - совковые ребята","Сектор Газа",YadrenaVosh),
              new Song("Скотник","Сектор Газа",YadrenaVosh),
              new Song("Носки","Сектор Газа",YadrenaVosh),
              new Song("Импотент","Сектор Газа",YadrenaVosh),
              new Song("Ядрена Вошь","Сектор Газа",YadrenaVosh),
              new Song("Мент","Сектор Газа",YadrenaVosh),
              new Song("Колыбельная","Сектор Газа",YadrenaVosh),
              new Song("План","Сектор Газа",YadrenaVosh),
              new Song("Спор","Сектор Газа",YadrenaVosh),
              new Song("Караван","Сектор Газа",YadrenaVosh),
              new Song("Пердун","Сектор Газа",YadrenaVosh),
              new Song("Вечером на лавочке","Сектор Газа",YadrenaVosh),
              new Song("Возле дома твоего","Сектор Газа",YadrenaVosh),
              new Song("Минет","Сектор Газа",YadrenaVosh) });

        Album NochPeredRozdestvom = new Album("Ночь перед рождеством",R.drawable.npr,"Сектор Газа",1991,15036);
        NochPeredRozdestvom.setSongs(new Song[]{
                new Song("Привет, ребята, добрый день","Сектор Газа",NochPeredRozdestvom),
                new Song("Ява","Сектор Газа",NochPeredRozdestvom),
                new Song("Шары","Сектор Газа",NochPeredRozdestvom),
                new Song("Давай-давай","Сектор Газа",NochPeredRozdestvom),
                new Song("Белая горячка","Сектор Газа",NochPeredRozdestvom),
                new Song("Голубь","Сектор Газа",NochPeredRozdestvom),
                new Song("Презерватив","Сектор Газа",NochPeredRozdestvom),
                new Song("Презерватив - 2","Сектор Газа",NochPeredRozdestvom),
                new Song("Щи","Сектор Газа",NochPeredRozdestvom),
                new Song("Здравствуйте, детишки","Сектор Газа",NochPeredRozdestvom),
                new Song("Снегурочка","Сектор Газа",NochPeredRozdestvom),
                new Song("Илья муромец","Сектор Газа",NochPeredRozdestvom),
                new Song("Кума","Сектор Газа",NochPeredRozdestvom),
                new Song("Ночь перед рождеством","Сектор Газа",NochPeredRozdestvom),
        });

        albums.add(VosstavshiyIzAda);
        albums.add(ZloveshieMertvetsi);
        albums.add(GazovayaAtaka);
        albums.add(YadrenaVosh);
        albums.add(NochPeredRozdestvom);
    }
}