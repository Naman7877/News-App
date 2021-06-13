package com.example.newsapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.webclass;

public class Aaj_tak extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Aaj_tak() {
        // Required empty public constructor
    }

    public static Aaj_tak newInstance(String param1, String param2) {
        Aaj_tak fragment = new Aaj_tak();
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
        View view=inflater.inflate(R.layout.fragment_aaj_tak, container, false);


        // Inflate the layout for this fragment
        WebView aaj=view.findViewById(R.id.webviewaaj);
        aaj.loadUrl("https://www.aajtak.in");

        // for conrol the web page
        aaj.setWebViewClient(new webclass());

        return view;
    }
}