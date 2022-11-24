package com.example.infogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.infogram.R;
import com.example.infogram.adapter.CardViewAdapter;
import com.example.infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolbar(getString(R.string.title_home_fragment), false, view);

        //recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layout managar
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter


        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(),R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);
        return view;
    }

    public void showToolbar(String titulo, Boolean botonSubir, View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos lista de imagenes
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add( new Image ("https://alejotadic.files.wordpress.com/2014/01/dsc_0978.jpg", "Carlos Valdias", "2dias" ,"1 me gusta"));
        images.add( new Image ("https://www.boliviaentusmanos.com/imagenes/ciudades/650x400/quillacollo.jpg", "Juan Torrico", "11 dias" ,"2 me gusta"));
        images.add( new Image ("https://www.opinion.com.bo/asset/thumbnail,992,558,center,center/media/opinion/images/2013/02/02/2013N85059.jpg", "Pepe Valdias", "9 dias" ,"3 me gusta"));
        images.add( new Image ("https://www.presidencia.gob.bo/images/noticias/Teleferico_plateada.jpg", "Carlos Flores", "8 dias" ,"4 me gusta"));
        images.add( new Image ("magazinemanagement.gm-bolivia.com/wp-content/uploads/2021/11/6030819859692969.jpg", "Alejandro Mercado", "6 dias" ,"5 me gusta"));
        images.add( new Image ("https://i.ytimg.com/vi/Zx9rhRUEVe0/maxresdefault.jpg", "Tito Rojas", "3 dias" ,"6 me gusta"));
        images.add( new Image ("https://cd1.eju.tv/wp-content/uploads/2015/03/image695.png", "Dani Espinosa", "22 dias" ,"7 me gusta"));
        images.add( new Image ("https://media-cdn.tripadvisor.com/media/photo-s/1a/7d/6d/8f/caption.jpg", "Jose Angulo", "12 dias" ,"8 me gusta"));
        images.add( new Image ("https://c8.alamy.com/compes/f56fdd/cristo-de-la-concordia-o-el-cristo-de-la-paz-es-una-estatua-de-jesus-cristo-situado-en-la-cima-de-cerro-san-pedro-cochabamba-bolivia-f56fdd.jpg", "Alverth Tata", "23 dias" ,"8 me gusta"));
        images.add( new Image ("https://denomades.s3.us-west-2.amazonaws.com/blog/wp-content/uploads/2017/06/11140955/titicacaOK.jpg", "Vivian katara", "5 dias" ,"10 me gusta"));

        return images;
    }
}
